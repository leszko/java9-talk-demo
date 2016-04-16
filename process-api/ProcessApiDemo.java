public class ProcessApiDemo{

  public static void main(String[] args){
    System.out.println("Current Process PID: " + ProcessHandle.current().getPid());
  }

}
