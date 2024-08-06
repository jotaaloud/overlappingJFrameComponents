## Overlapping JFrame components
How to overlapp a JFrame component over Graphics ( Java )
![https://github.com/jotaaloud](https://github.com/jotaaloud/overlappingJFrameComponents/blob/9b623ce9ca659ee2496e5790059856479427ca08/src/files/beforeAfter.jpg)

I was having trouble trying to paint a JLabel/JButton(Java.awt.*) over a Rect(java.awt.Graphics), to change the color of the Rect or to add new Polygons.<br />
This is a repo to explain with a few words how to fix it.<br />

1. Add the JFrame elements <br />
2. Add the Graphics g function and its components <br />
3. Write the 'setBounds' and add the JFrame components AFTER the graphics. You have to do this step INSIDE the Graphics function<br />
