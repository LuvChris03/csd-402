export abstract class Division {
  constructor(
    public divisionName: string,
    public accountNumber: string
  ) {}

  abstract display(): void;
}