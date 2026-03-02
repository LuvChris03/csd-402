import { Division } from "./Division";

export class DomesticDivision extends Division {
  constructor(
    divisionName: string,
    accountNumber: string,
    public state: string
  ) {
    super(divisionName, accountNumber);
  }

  display(): void {
    console.log(`[Domestic Division]`);
    console.log(`Name:           ${this.divisionName}`);
    console.log(`Account Number: ${this.accountNumber}`);
    console.log(`State:          ${this.state}`);
    console.log("--------------------------------------------------");
  }
}