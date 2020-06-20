import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class FirebaseStart {

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {

        FileInputStream serviceAccount =
                new FileInputStream("D:\\Uczelnia\\proga\\InzynieriaProgProjekt\\Repozytorium-master\\Repozytorium-master\\app\\src\\main\\res\\stepbystep-6631e-firebase-adminsdk-87ely-d31cd8d92a.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://stepbystep-6631e.firebaseio.com")
                .build();
        FirebaseApp.initializeApp(options);
    }
}
