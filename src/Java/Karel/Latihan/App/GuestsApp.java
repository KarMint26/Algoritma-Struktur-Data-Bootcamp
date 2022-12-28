package Java.Karel.Latihan.App;

import Java.Karel.Latihan.Repository.Repository;
import Java.Karel.Latihan.Repository.RepositoryImpl;
import Java.Karel.Latihan.Service.Service;
import Java.Karel.Latihan.Service.ServiceImpl;
import Java.Karel.Latihan.ViewApp.GuestRecord;

public class GuestsApp {
    public static void main(String[] args) {

        Repository repository = new RepositoryImpl();
        Service service = new ServiceImpl(repository);
        GuestRecord guestRecord = new GuestRecord(service);

        guestRecord.viewFrontApp();

    }
}
