package diuis.test.cache;

public class MainLoop {

  public MainLoop() {
  }

  public static void main(String[] args) {

    InstantCachedRepository repo = new InstantCachedRepository();

    for (int x = 0; x < 50; x++) {
      for (long i = 0L; i < 3L; i++) {
        InstantObject item = repo.getItem(i);
        System.out.println(item);
      }
      try {
        System.out.println("sleeping 2 secs");
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

  }

}
