package com.example.nanorus.materialweather.di.settings;

import com.example.nanorus.materialweather.presentation.settings.presenter.ISettingsPresenter;
import com.example.nanorus.materialweather.presentation.settings.presenter.SettingsPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class SettingsModule {

    @Provides
    ISettingsPresenter bindSettingsPresenter(){
        return new SettingsPresenter();
    }

}
