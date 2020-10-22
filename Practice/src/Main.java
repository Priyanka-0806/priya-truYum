class Main extends Thread{
public void run(){
   for(int i=1;i<=10;i++){
        System.out.println(Thread.currentThread().getName()+"\t"+i);
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
}
public static void main(String a[]) throws InterruptedException{
  Main main=new Main();
  //main.run();process
  main.start();//thread
  main.join();
  Main main1=new Main();
  main1.start();//race condition
  main1.join();
  
}
}
