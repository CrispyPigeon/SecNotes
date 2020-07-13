package by.crispypigeon.secnotes.di.activities;

import android.app.Activity;
import android.content.Context;

import by.crispypigeon.secnotes._models.auth.AuthModel;
import by.crispypigeon.secnotes._views.auth.AuthActivity;
import by.crispypigeon.secnotes.assistances.storage.SharedPreferencesAssistance;
import by.crispypigeon.secnotes.di.AppComponent;
import by.crispypigeon.secnotes.di.context.ContextModule;
import dagger.Component;

@Component(dependencies = AppComponent.class,
           modules = {ActivityModule.class, ContextModule.class})
@ActivityScope
public interface ActivityComponent {

    Context getContext();

    SharedPreferencesAssistance getSharedPreferencesAssistance();

    void inject(AuthModel model);
}
