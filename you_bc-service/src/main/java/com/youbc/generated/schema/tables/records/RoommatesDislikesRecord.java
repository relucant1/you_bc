/*
 * This file is generated by jOOQ.
*/
package com.youbc.generated.schema.tables.records;


import com.youbc.generated.schema.tables.RoommatesDislikes;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoommatesDislikesRecord extends UpdatableRecordImpl<RoommatesDislikesRecord> implements Record3<Integer, Integer, Timestamp> {

    private static final long serialVersionUID = 1369954795;

    /**
     * Setter for <code>you_bc.roommates_dislikes.disliker</code>.
     */
    public RoommatesDislikesRecord setDisliker(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>you_bc.roommates_dislikes.disliker</code>.
     */
    public Integer getDisliker() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>you_bc.roommates_dislikes.dislikee</code>.
     */
    public RoommatesDislikesRecord setDislikee(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>you_bc.roommates_dislikes.dislikee</code>.
     */
    public Integer getDislikee() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>you_bc.roommates_dislikes.time_created</code>.
     */
    public RoommatesDislikesRecord setTimeCreated(Timestamp value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>you_bc.roommates_dislikes.time_created</code>.
     */
    public Timestamp getTimeCreated() {
        return (Timestamp) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Timestamp> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Timestamp> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return RoommatesDislikes.ROOMMATES_DISLIKES.DISLIKER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return RoommatesDislikes.ROOMMATES_DISLIKES.DISLIKEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return RoommatesDislikes.ROOMMATES_DISLIKES.TIME_CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getDisliker();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getDislikee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getTimeCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoommatesDislikesRecord value1(Integer value) {
        setDisliker(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoommatesDislikesRecord value2(Integer value) {
        setDislikee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoommatesDislikesRecord value3(Timestamp value) {
        setTimeCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoommatesDislikesRecord values(Integer value1, Integer value2, Timestamp value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoommatesDislikesRecord
     */
    public RoommatesDislikesRecord() {
        super(RoommatesDislikes.ROOMMATES_DISLIKES);
    }

    /**
     * Create a detached, initialised RoommatesDislikesRecord
     */
    public RoommatesDislikesRecord(Integer disliker, Integer dislikee, Timestamp timeCreated) {
        super(RoommatesDislikes.ROOMMATES_DISLIKES);

        set(0, disliker);
        set(1, dislikee);
        set(2, timeCreated);
    }
}
