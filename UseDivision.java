import { InternationalDivision } from "./InternationalDivision";
import { DomesticDivision } from "./DomesticDivision";

function main() {
  // Create 2 instances of InternationalDivision
  const intDiv1 = new InternationalDivision("European Operations", "INT-100", "Germany", "German");
  const intDiv2 = new InternationalDivision("Asian Market", "INT-200", "Japan", "Japanese");

  // Create 2 instances of DomesticDivision
  const domDiv1 = new DomesticDivision("West Coast Sales", "DOM-100", "California");
  const domDiv2 = new DomesticDivision("East Coast Manufacturing", "DOM-200", "New York");

  // Display information for all instances
  intDiv1.display();
  intDiv2.display();
  domDiv1.display();
  domDiv2.display();
}

// Run the application
main();