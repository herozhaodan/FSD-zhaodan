import { Training } from '../interface';

/** return fresh array of test heroes */
export function getTestTrainings(): Training[] {
  return [
    {name: 'Vin Zhdd', years: 2, numberOfTraining: 30, specificTech: 'Java', feeCharged: 2000 },
    {name: 'Bruce Zhgg', years: 3, numberOfTraining: 40, specificTech: 'Spring', feeCharged: 1200 },
    {name: 'Richard', years: 7, numberOfTraining: 20, specificTech: 'Websphere', feeCharged: 2100 },
    {name: 'Tazhu', years: 7, numberOfTraining: 20, specificTech: 'Html5', feeCharged: 1500 }
  ];
}