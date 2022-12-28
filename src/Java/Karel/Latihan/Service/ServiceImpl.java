package Java.Karel.Latihan.Service;

import Java.Karel.Latihan.Entity.EventOrganiser;
import Java.Karel.Latihan.Repository.Repository;
import Java.Karel.Latihan.Repository.RepositoryImpl;

public class ServiceImpl implements Service{

    Repository repository;

    public ServiceImpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void viewShowListGuests() {
        EventOrganiser[] eventOrganisers = repository.getAll();

        for (int i = 0; i < eventOrganisers.length; i++) {
            if (eventOrganisers[i] != null){
                System.out.println((i+1) + ". Tamu Yang Terdaftar : " + eventOrganisers[i].getCUSTNAME());
            }
        }
    }

    @Override
    public void viewAddListGuests(String index) {
        EventOrganiser addData = new EventOrganiser(index);

        repository.addGuestsToList(addData);
        System.out.println("Success Add Guests");
    }
}
