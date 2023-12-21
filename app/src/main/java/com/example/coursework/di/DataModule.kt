package com.example.coursework.di

import com.example.coursework.data.FactoryRepositoryImpl
import com.example.coursework.domain.FactoryRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    abstract fun getRepository(impl: FactoryRepositoryImpl): FactoryRepository
}