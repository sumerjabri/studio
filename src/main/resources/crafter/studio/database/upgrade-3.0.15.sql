ALTER TABLE `site` ADD COLUMN `sandbox_branch` VARCHAR(255) NOT NULL DEFAULT 'master' ;

UPDATE _meta SET version = '3.0.15.1' ;