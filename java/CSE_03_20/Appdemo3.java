import java.applet.*;
import java.awt.*;
public class Appdemo3 extends Applet
{
	int a,b,c;
	public void init()
	{
		a=Integer.parseInt(getParameter("A"));
		b=Integer.parseInt(getParameter("B"));
		c=a+b;
	}
	public void paint(Graphics g)
	{
		g.drawString(String.valueOf(c),100,100);
	}
}
/*<applet code="Appdemo3.class" height = 300 width = 300>
<param name="A" value=69>
<param name="B" value=96>
</applet>
*/

