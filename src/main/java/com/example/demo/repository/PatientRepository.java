package com.example.demo.repository;

import com.example.demo.entity.Patient;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    @Override
    default void flush() {

    }

    @Override
    default <S extends Patient> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    default <S extends Patient> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    default void deleteAllInBatch(Iterable<Patient> entities) {

    }

    @Override
    default void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    default void deleteAllInBatch() {

    }

    @Override
    default Patient getOne(Long aLong) {
        return null;
    }

    @Override
    default Patient getById(Long aLong) {
        return null;
    }

    @Override
    default Patient getReferenceById(Long aLong) {
        return null;
    }

    @Override
    default <S extends Patient> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    default <S extends Patient> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    default <S extends Patient> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    default <S extends Patient> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    default <S extends Patient> long count(Example<S> example) {
        return 0;
    }

    @Override
    default <S extends Patient> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    default <S extends Patient, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    default <S extends Patient> S save(S entity) {
        return null;
    }

    @Override
    default <S extends Patient> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    default Optional<Patient> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    default boolean existsById(Long aLong) {
        return false;
    }

    @Override
    default List<Patient> findAll() {
        return null;
    }

    @Override
    default List<Patient> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    default long count() {
        return 0;
    }

    @Override
    default void deleteById(Long aLong) {

    }

    @Override
    default void delete(Patient entity) {

    }

    @Override
    default void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    default void deleteAll(Iterable<? extends Patient> entities) {

    }

    @Override
    default void deleteAll() {

    }

    @Override
    default List<Patient> findAll(Sort sort) {
        return null;
    }

    @Override
    default Page<Patient> findAll(Pageable pageable) {
        return null;
    }
}
