import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.Node;
import javafx.scene.image.ImageView;


public class Graphics{
  /** An ImageView is created in order to pull in the specific image to use for the character. The width, height, x coord, and y coord is set inside of Game.java */
  ImageView player = new ImageView("https://raw.githubusercontent.com/RMcCurdy/TeamProjectGroup14/master/Images/alejandro-2.png?token=ApkDjG3QpMdkdKtqJ4uwSCDIybeWTQbJks5cjg1RwA%3D%3D");
  
  /** Node created to set hit boxes and boundaries for the level*/
  public Node createEntity(int x, int y, int w, int h, Color color){
    Rectangle entity = new Rectangle(w, h);
    entity.setTranslateX(x);
    entity.setTranslateY(y);
    entity.setFill(color);
    return entity;
  }

  /** Node created to pull in the image to use for the brick. The dimensions and coordinates for the image are set inside of this method */
  public Node createBrick(int x, int y, int w, int h){
    ImageView entity = new ImageView("https://raw.githubusercontent.com/RMcCurdy/TeamProjectGroup14/master/Images/brick.png?token=ApkDjG3QpMdkdKtqJ4uwSCDIybeWTQbJks5cjg1RwA%3D%3D");
    entity.setX(x);
    entity.setY(y);
    entity.setFitHeight(w);
    entity.setFitWidth(h);
    return entity;
  }

  /** Node created to pull in the image to use for the coin. The dimensions and coordinates for the image are set inside of this method */
  public Node createCoin(int x, int y, int w, int h){
    ImageView coin = new ImageView("https://raw.githubusercontent.com/RMcCurdy/TeamProjectGroup14/master/Images/frame1-sky3.png?token=ApkDjG3QpMdkdKtqJ4uwSCDIybeWTQbJks5cjg1RwA%3D%3D");
    coin.setX(x);
    coin.setY(y);
    coin.setFitWidth(w);
    coin.setFitHeight(h);
    return coin;
  }
  
  /** Node created to pull in the image to use for the ground. The dimensions and coordinates for the image are set inside of this method */
  public Node createGround(int x, int y, int w, int h){
    ImageView ground = new ImageView("https://raw.githubusercontent.com/RMcCurdy/TeamProjectGroup14/master/Images/ground64by64.png?token=ApkDjG3QpMdkdKtqJ4uwSCDIybeWTQbJks5cjg1RwA%3D%3D");
    ground.setX(x);
    ground.setY(y);
    ground.setFitWidth(w);
    ground.setFitHeight(h);
    return ground;
  }

  /** Node created to pull in the image to use for the cloud. The dimensions and coordinates for the image are set inside of this method */
  public Node createCloud(int x, int y, int w, int h){
    ImageView cloud = new ImageView("https://raw.githubusercontent.com/RMcCurdy/TeamProjectGroup14/master/Images/cloud32by64.png?token=ApkDjG3QpMdkdKtqJ4uwSCDIybeWTQbJks5cjg1RwA%3D%3D");
    cloud.setX(x);
    cloud.setY(y);
    cloud.setFitWidth(w);
    cloud.setFitHeight(h);
    return cloud;
  }

  /** Node created to pull in the image to use for the background. The dimensions and coordinates for the image are set inside of this method */
  public Node createBack(int x, int y, int w, int h){
    ImageView back = new ImageView("https://raw.githubusercontent.com/RMcCurdy/TeamProjectGroup14/master/Images/background-sky3.png?token=ApkDjG3QpMdkdKtqJ4uwSCDIybeWTQbJks5cjg1RwA%3D%3D");
    back.setX(x);
    back.setY(y);
    back.setFitWidth(w);
    back.setFitHeight(h);
    return back;
  }

  /** Node created to pull in the image to use for the middle of the pipe. The dimensions and coordinates for the image are set inside of this method */
  public Node createPipeMain(int x, int y, int w, int h){
    ImageView pipeM = new ImageView("https://raw.githubusercontent.com/RMcCurdy/TeamProjectGroup14/master/Images/pipemain.png?token=ApkDjG3QpMdkdKtqJ4uwSCDIybeWTQbJks5cjg1RwA%3D%3D");
    pipeM.setX(x);
    pipeM.setY(y);
    pipeM.setFitWidth(w);
    pipeM.setFitHeight(h);
    return pipeM;
  }

  /** Node created to pull in the image to use for the top of the pipe. The dimensions and coordinates for the image are set inside of this method */
  public Node createPipeTop(int x, int y, int w, int h){
    ImageView pipeT = new ImageView("https://raw.githubusercontent.com/RMcCurdy/TeamProjectGroup14/master/Images/pipetop.png?token=ApkDjG3QpMdkdKtqJ4uwSCDIybeWTQbJks5cjg1RwA%3D%3D");
    pipeT.setX(x);
    pipeT.setY(y);
    pipeT.setFitWidth(w);
    pipeT.setFitHeight(h);
    return pipeT;
  }
}
