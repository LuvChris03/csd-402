+---------------------------------------------------+
| Christopher Craig  2/8/26                         |
+---------------------------------------------------+
|
v
Start
|
v
main() method
|
v
Create Scanner input
|
v
Create ArrayList<Integer> list
|
v
Print "Enter integers (enter 0 to end):"
|
v
WHILE TRUE LOOP:
    |
    v
    Read integer from input (value)
    |
    v
    Add value to list
    |
    v
    Is value == 0 ?
        /     \
      Yes      No
       |        |
       v        v
    Break loop  Continue loop
    |
    v
Catch invalid input? (Exception)
       /       \
     Yes         No
      |           |
      v           v
Print "Please enter a valid integer"
Clear invalid input
|
v
Call max(list)
|
v
max(ArrayList<Integer> list) method:
    |
    v
Is list null or empty?
        /      \
      Yes       No
       |         |
       v         v
Return 0    Initialize maxValue = list.get(0)
               |
               v
       FOR each value in list:
               |
               v
           Is value > maxValue ?
               /       \
             Yes         No
              |           |
              v           v
          maxValue = value   continue loop
               |
               v
Return maxValue
|
v
Back to main()
|
v
Print "--- Results ---"
Print "ArrayList: " + list
Print "The largest value is: " + maxValue
|
v
Close Scanner input
|
v
End main()
|
v
Stop
