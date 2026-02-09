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
Create ArrayList<Fan> fanCollection
|
v
Create Fan instances:
    f1 = default Fan
    f2 = FAST, ON, 12.0, "red"
    f3 = MEDIUM, ON, 8.0, "black"
    f4 = SLOW, OFF, 5.0, "green"
|
v
Add f1, f2, f3, f4 to fanCollection
|
v
Call displayFans(fanCollection)
|
v
displayFans(Collection<Fan> fans)  ---> For each Fan in fans
      |
      v
      Call displayFan(fan)
            |
            v
            Is fan.on() ?
            /      \
          Yes        No
           |          |
           v          v
Print: "Fan status: ON | Speed: X | Radius: X | Color: X"
           |          
           v
Print: "Fan status: OFF | Radius: X | Color: X"
            |
            v
End displayFan()
      |
      v
Loop to next Fan in collection
|
v
End displayFans()
|
v
End main()
|
v
Stop
