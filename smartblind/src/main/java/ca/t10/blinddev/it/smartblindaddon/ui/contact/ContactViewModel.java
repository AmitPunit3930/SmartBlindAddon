package ca.t10.blinddev.it.smartblindaddon.ui.contact;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ContactViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ContactViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Welcome to Contact Page");
    }

    public LiveData<String> getText() {
        return mText;
    }
}