/*
 * Copyright (C) 2007-2018 Crafter Software Corporation. All rights reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.craftercms.studio.model.rest;

/**
 * A {@link Result} where the actual result is a single entity.
 *
 * @param <T> the entity type
 *
 * @author Dejan Brkic
 * @author avasquez
 */
public class ResultOne<T> extends Result {

    protected T entity;

    /**
     * Returns the result entity.
     */
    public T getEntity() {
        return entity;
    }

    /**
     * Sets the result entity.
     */
    public void setEntity(T entity) {
        this.entity = entity;
    }
}