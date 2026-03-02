import { Division } from "./Division";

export class InternationalDivision extends Division {
  constructor(
    divisionName: string,
    accountNumber: string,
    public country: string,
    public language: string
  ) {
    super(divisionName, accountNumber);
  }

  display(): void {
    console.log(`[International Division]`);
    console.log(`Name:           ${this.divisionName}`);
    console.log(`Account Number: ${this.accountNumber}`);
    console.log(`Country:        ${this.country}`);
    console.log(`Language:       ${this.language}`);
    console.log("--------------------------------------------------");
  }
}