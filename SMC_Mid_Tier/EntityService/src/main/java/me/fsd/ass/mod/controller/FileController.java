package me.fsd.ass.mod.controller;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import me.fsd.ass.mod.dao.StockPriceRepository;
import me.fsd.ass.mod.entity.StockPrice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@RestController
@CrossOrigin
public class FileController {
    private static final Logger logger = Logger.getLogger(FileController.class.getName());
    @Autowired
    StockPriceRepository stockPriceRepository;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadData(@RequestParam("file") MultipartFile file) throws Exception {
        if (file == null) {
            throw new RuntimeException("You must select the a file for uploading");
        }
        InputStream inputStream = file.getInputStream();
        String originalName = file.getOriginalFilename();
        String name = file.getName();
        String contentType = file.getContentType();
        long size = file.getSize();
        logger.info("inputStream: " + inputStream);
        logger.info("originalName: " + originalName);
        logger.info("name: " + name);
        logger.info("contentType: " + contentType);
        logger.info("size: " + size);
        // Do processing with uploaded file data in Service layer
        try {
            List<StockPrice> lstStockPrice = new ArrayList<StockPrice>();
            int i = 1;
            // Creates a workbook object from the uploaded excelfile
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            // Creates a worksheet object representing the first sheet
            XSSFSheet worksheet = workbook.getSheetAt(0);
            // Reads the data in excel file until last row is encountered
            while (i <= worksheet.getLastRowNum()) {
                // Creates an object for the UserInfo Model
                StockPrice stockPrice = new StockPrice();
                // Creates an object representing a single row in excel
                XSSFRow row = worksheet.getRow(i++);
                // Sets the Read data to the model class
                //user.setId((int) row.getCell(0).getNumericCellValue());
                stockPrice.setCompanyCode(row.getCell(0).getStringCellValue());
                stockPrice.setStockExchange(row.getCell(1).getStringCellValue());
                stockPrice.setPricePerShare(row.getCell(2).getNumericCellValue());
                stockPrice.setDate(row.getCell(3).getDateCellValue());
                stockPrice.setTime(row.getCell(4).getStringCellValue());
                // persist data into database in here
                lstStockPrice.add(stockPrice);
            }
            workbook.close();

            stockPriceRepository.saveAll(lstStockPrice);

//            bean.addMessage(Message.SUCCESS, "Upload Excel 2007 Successfull");
//            model.addAttribute("bean", bean);
            return new ResponseEntity<String>(originalName, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<String>(originalName, HttpStatus.EXPECTATION_FAILED);
        }



    }
}