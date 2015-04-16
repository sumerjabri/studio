/*
 * Crafter Studio Web-content authoring solution
 * Copyright (C) 2007-2015 Crafter Software Corporation.
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
 */

package org.craftercms.studio.api.v1.deployment;

import org.craftercms.studio.api.v1.service.deployment.ContentNotFoundForPublishingException;
import org.craftercms.studio.api.v1.service.deployment.DeploymentException;
import org.craftercms.studio.api.v1.service.deployment.UploadFailedException;
import org.craftercms.studio.api.v1.to.DeploymentEndpointConfigTO;

import java.util.List;

public interface Deployer {

    void deployFile(String site, String path);

    //void deployFile(String site, String path, String environment);

    void deployFiles(String site, List<String> paths);

    void deployFiles(String site, List<String> paths, List<String> deletedFiles) throws ContentNotFoundForPublishingException, UploadFailedException;

   // void deployFiles(String site, List<String> paths, String environment);

    void deleteFile(String site, String path);

    //void deleteFile(String site, String path, String environment);

    void deleteFiles(String site, List<String> paths);

    //void deleteFiles(String site, List<String> paths, String environment);
}