import java.awt.*;  
import java.applet.*;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;  
  /*
<applet code="mini_project_4" width=150 height=1500>
</applet>
*/
  
public class mini_project_4 extends Applet {  
  
  Image picture;  
  
  public void init() {  
    picture = getImage(getDocumentBase(),"PicsArt_04-05-08.29.19.png");
	
  }  
    
	
		public static BufferedImage toBufferedImage(Image img){
    if (img instanceof BufferedImage) {
        return (BufferedImage) img;
    }
    BufferedImage bimage = new BufferedImage(img.getWidth(null)+2, img.getHeight(null)+2, BufferedImage.TYPE_INT_ARGB);
    Graphics2D bGr = bimage.createGraphics();
    bGr.dispose();
    return bimage;
}
	
  public void paint(Graphics g) {  
    g.setColor(Color.RED);
    g.drawImage(picture, 0,0, this); 
	BufferedImage bi=toBufferedImage(picture);
	
	int width,height;
	width=bi.getWidth();
	height=bi.getHeight();
	int t=370;
	for(int i=0; i<height; i++){
         
            for(int j=0; j<width; j++){
               Color c = new Color(bi.getRGB(j, i));
			   if(c.getRed()==255 && c.getGreen()==0 && c.getBlue()==0){
				   g.drawString("i = :"+i+"j = :"+j,300,t);
				   t=t+10;
			   }
            }
         }
	
	
    bi.getRGB(9,10);
	Color c=new Color(bi.getRGB(128,343));
	Color c1=new Color(c.getRed(),c.getGreen(),c.getBlue());
	g.drawString("COLOR : "+c,300,410);
	g.fillRect(98,343,3,3); //parking space 10
	g.fillRect(108,195,3,3); //parking space 1
	g.fillRect(128,343,3,3); //parking space 11
	g.fillRect(138,195,3,3); //parking space 2
	g.fillRect(153,343,3,3); //parking space 12
	g.fillRect(168,195,3,3); //parking space 3
	g.fillRect(183,343,3,3); //parking space 13
	g.fillRect(198,195,3,3); //parking space 4
	g.fillRect(228,195,3,3); //parking space 5
	g.fillRect(263,343,3,3); //parking space 14
	g.fillRect(288,340,3,3); //parking space 15
	g.fillRect(313,195,3,3); //parking space 6
	g.fillRect(338,195,3,3); //parking space 7
	g.fillRect(319,343,3,3); //parking space 16
	g.fillRect(348,343,3,3); //parking space 17
	g.fillRect(373,343,3,3); //parking space 18
	g.fillRect(368,195,3,3); //parking space 8
	g.fillRect(398,195,3,3); //parking space 9
	
	
g.setColor(Color.GREEN);
g.drawRect(87,300,26,60); //parking space 10	
g.drawRect(117,300,26,60); //parking space 11
g.drawRect(142,300,26,60); //parking space 12
g.drawRect(172,300,26,60); //parking space 13
g.drawRect(252,300,26,60); //parking space 14
g.drawRect(277,300,26,60); //parking space 15
g.drawRect(305,300,26,60); //parking space 16
g.drawRect(335,300,26,60);  // parking space 17
g.drawRect(362,300,26,60);  //parking space 18
g.drawRect(97,170,26,60);  //parking space 1
g.drawRect(125,170,26,60); //parking space 2
g.drawRect(156,170,26,60); //parking space 3
g.drawRect(185,170,26,60); // parking space 4
g.drawRect(215,170,26,60); //parking space 5
g.drawRect(302,170,26,60);//parking space 6
g.drawRect(329,170,26,60);//parking space 7
g.drawRect(357,170,26,60);//parking space 8
g.drawRect(387,170,26,60);//parking space 9
	Graphics2D g2d = (Graphics2D) g;
g2d.setColor(Color.BLUE);
	float[] dashingPattern3 = {10f, 10f, 1f, 10f};
Stroke stroke3 = new BasicStroke(4f, BasicStroke.CAP_SQUARE,
        BasicStroke.JOIN_MITER, 1.0f, dashingPattern3, 0.0f);
 
 
g2d.setStroke(stroke3);

g2d.draw(new Line2D.Float(50.50f, 270.50f, 100.50f, 270.50f));
g2d.draw(new Line2D.Float(100.50f,270.50f,100.0f,350.0f));  //parking space 10
g2d.draw(new Line2D.Float(50.50f, 270.50f, 110.50f, 270.50f));
g2d.draw(new Line2D.Float(110.50f,270.50f,110.0f,200.0f));   //parking space 1 
g2d.draw(new Line2D.Float(50.50f, 270.50f, 130.50f, 270.50f));
g2d.draw(new Line2D.Float(130.50f,270.50f,130.0f,350.0f));    //parking space 11
g2d.draw(new Line2D.Float(50.50f, 270.50f, 140.50f, 270.50f));
g2d.draw(new Line2D.Float(140.50f,270.50f,140.0f,200.0f));    //parking space 2
g2d.draw(new Line2D.Float(50.50f, 270.50f, 155.50f, 270.50f));
g2d.draw(new Line2D.Float(155.50f,270.50f,155.0f,350.0f));    //parking space 12
g2d.draw(new Line2D.Float(50.50f, 270.50f, 170.50f, 270.50f));
g2d.draw(new Line2D.Float(170.50f,270.50f,170.0f,200.0f));    //parking space 3
g2d.draw(new Line2D.Float(50.50f, 270.50f, 185.50f, 270.50f));
g2d.draw(new Line2D.Float(185.50f,270.50f,185.0f,350.0f));    //parking space 13
g2d.draw(new Line2D.Float(50.50f, 270.50f, 200.50f, 270.50f));
g2d.draw(new Line2D.Float(200.50f,270.50f,200.0f,200.0f));    //parking space 4	
g2d.draw(new Line2D.Float(50.50f, 270.50f, 230.50f, 270.50f));
g2d.draw(new Line2D.Float(230.50f,270.50f,230.0f,200.0f));    //parking space 5
g2d.draw(new Line2D.Float(50.50f, 270.50f, 265.50f, 270.50f));
g2d.draw(new Line2D.Float(265.50f,270.50f,265.0f,350.0f));    //parking space 14
g2d.draw(new Line2D.Float(50.50f, 270.50f, 290.50f, 270.50f));
g2d.draw(new Line2D.Float(290.50f,270.50f,290.0f,350.0f));    //parking space 15
g2d.draw(new Line2D.Float(50.50f, 270.50f, 315.50f, 270.50f));
g2d.draw(new Line2D.Float(315.50f,270.50f,315.0f,200.0f));    //parking space 6
g2d.draw(new Line2D.Float(50.50f, 270.50f, 340.50f, 270.50f));
g2d.draw(new Line2D.Float(340.50f,270.50f,340.0f,200.0f));    //parking space 7 
g2d.draw(new Line2D.Float(50.50f, 270.50f, 320.50f, 270.50f));
g2d.draw(new Line2D.Float(320.50f,270.50f,320.0f,350.0f));    //parking space 16
g2d.draw(new Line2D.Float(50.50f, 270.50f, 350.50f, 270.50f));
g2d.draw(new Line2D.Float(350.50f,270.50f,350.0f,350.0f));    //parking space 17 
g2d.draw(new Line2D.Float(50.50f, 270.50f, 375.50f, 270.50f));
g2d.draw(new Line2D.Float(375.50f,270.50f,375.0f,350.0f));    //parking space 18
g2d.draw(new Line2D.Float(50.50f, 270.50f, 370.50f, 270.50f));
g2d.draw(new Line2D.Float(370.50f,270.50f,370.0f,200.0f));    //parking space 8
g2d.draw(new Line2D.Float(50.50f, 270.50f, 400.50f, 270.50f));
g2d.draw(new Line2D.Float(400.50f,270.50f,400.0f,200.0f));    //parking space 9

  }  
      
  }  