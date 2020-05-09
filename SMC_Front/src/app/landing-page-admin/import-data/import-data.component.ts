import { Component, OnInit } from '@angular/core';
import { HttpClientService } from 'src/app/service/http-client.service';
import { FileService } from 'src/app/service/file.service';
import { HttpResponse, HttpEventType } from '@angular/common/http';

@Component({
  selector: 'app-import-data',
  templateUrl: './import-data.component.html',
  styleUrls: ['./import-data.component.css']
})

export class ImportDataComponent implements OnInit {

  selectedFiles: FileList;
  currentFile: File;
  
  constructor(
    private fileService: FileService
  ) { }

  selectFile(event) {
    this.selectedFiles = event.target.files;
  }
  
  upload() {
    this.currentFile = this.selectedFiles.item(0);
    this.fileService.uploadFile(this.currentFile).subscribe(response => {
		  this.selectedFiles["value"] = '';
      if (response instanceof HttpResponse) {
		  this["msg"] = response.body;
        console.log(response.body);
      }	  
    });    
  }

  ngOnInit() {

  }



}
