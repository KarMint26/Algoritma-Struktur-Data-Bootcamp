package Java.Karel.Latihan.Repository;

import Java.Karel.Latihan.Entity.EventOrganiser;

public interface Repository {
    EventOrganiser[] getAll();
    void addGuestsToList(EventOrganiser index);
}
