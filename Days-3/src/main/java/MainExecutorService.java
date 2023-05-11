import java.util.concurrent.*;

public class MainExecutorService {
    public static void main(String[] args) {

        Runnable rn = () -> {
            try {

                CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(
                        () -> {
                            try {
                                Thread.sleep(1000);
                                System.out.println("Completable Future-1 Call");
                            } catch (Exception ex) {
                            }
                        }
                );
                completableFuture.join();

                CompletableFuture<String> stringCompletableFuture = new CompletableFuture<>();
                Executors.newCachedThreadPool().submit(() -> {
                    stringCompletableFuture.complete("Thread Finish");
                });
                String data = stringCompletableFuture.get();
                System.out.println(data);
            }catch (Exception ex) {}
        };
        new Thread(rn).start();

        System.out.println("This Line Call");

    }
}
