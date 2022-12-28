package Java.Karel.Latihan.Repository;

import Java.Karel.Latihan.Entity.EventOrganiser;

public class RepositoryImpl implements Repository{

    public EventOrganiser[] eventOrganisers = new EventOrganiser[10];
    @Override
    public EventOrganiser[] getAll() {
        return eventOrganisers;
    }
    @Override
    public void addGuestsToList(EventOrganiser index) {
        for (int i = 0; i < eventOrganisers.length; i++) {
            if (eventOrganisers[i] == null){
                eventOrganisers[i] = index;
                break;
            }
        }
    }
}
