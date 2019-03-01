package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICopyVaultJob extends js.Object {
  var CopyflagAllData: scala.Boolean
  var CopyflagAllExceptData: scala.Boolean
  var CopyflagApplications: scala.Boolean
  var CopyflagDataSets: scala.Boolean
  var CopyflagDocumentProfiles: scala.Boolean
  var CopyflagDocuments: scala.Boolean
  var CopyflagEventLog: scala.Boolean
  var CopyflagExternalLocations: scala.Boolean
  var CopyflagFiles: scala.Boolean
  var CopyflagInternalEventHandlers: scala.Boolean
  var CopyflagLanguagesAndTranslations: scala.Boolean
  var CopyflagPropertyDefinitions: scala.Boolean
  var CopyflagScheduledExportAndImportJobs: scala.Boolean
  var CopyflagUseTargetGUID: scala.Boolean
  var CopyflagUserAccounts: scala.Boolean
  var CopyflagValueListContent: scala.Boolean
  var CopyflagValueLists: scala.Boolean
  var CopyflagViews: scala.Boolean
  var CopyflagWorkflows: scala.Boolean
  var VaultGUID: java.lang.String
  var VaultProperties: IVaultProperties
  def Clone(): ICopyVaultJob
}

object ICopyVaultJob {
  @scala.inline
  def apply(
    Clone: js.Function0[ICopyVaultJob],
    CopyflagAllData: scala.Boolean,
    CopyflagAllExceptData: scala.Boolean,
    CopyflagApplications: scala.Boolean,
    CopyflagDataSets: scala.Boolean,
    CopyflagDocumentProfiles: scala.Boolean,
    CopyflagDocuments: scala.Boolean,
    CopyflagEventLog: scala.Boolean,
    CopyflagExternalLocations: scala.Boolean,
    CopyflagFiles: scala.Boolean,
    CopyflagInternalEventHandlers: scala.Boolean,
    CopyflagLanguagesAndTranslations: scala.Boolean,
    CopyflagPropertyDefinitions: scala.Boolean,
    CopyflagScheduledExportAndImportJobs: scala.Boolean,
    CopyflagUseTargetGUID: scala.Boolean,
    CopyflagUserAccounts: scala.Boolean,
    CopyflagValueListContent: scala.Boolean,
    CopyflagValueLists: scala.Boolean,
    CopyflagViews: scala.Boolean,
    CopyflagWorkflows: scala.Boolean,
    VaultGUID: java.lang.String,
    VaultProperties: IVaultProperties
  ): ICopyVaultJob = {
    val __obj = js.Dynamic.literal(Clone = Clone, CopyflagAllData = CopyflagAllData, CopyflagAllExceptData = CopyflagAllExceptData, CopyflagApplications = CopyflagApplications, CopyflagDataSets = CopyflagDataSets, CopyflagDocumentProfiles = CopyflagDocumentProfiles, CopyflagDocuments = CopyflagDocuments, CopyflagEventLog = CopyflagEventLog, CopyflagExternalLocations = CopyflagExternalLocations, CopyflagFiles = CopyflagFiles, CopyflagInternalEventHandlers = CopyflagInternalEventHandlers, CopyflagLanguagesAndTranslations = CopyflagLanguagesAndTranslations, CopyflagPropertyDefinitions = CopyflagPropertyDefinitions, CopyflagScheduledExportAndImportJobs = CopyflagScheduledExportAndImportJobs, CopyflagUseTargetGUID = CopyflagUseTargetGUID, CopyflagUserAccounts = CopyflagUserAccounts, CopyflagValueListContent = CopyflagValueListContent, CopyflagValueLists = CopyflagValueLists, CopyflagViews = CopyflagViews, CopyflagWorkflows = CopyflagWorkflows, VaultGUID = VaultGUID, VaultProperties = VaultProperties)
  
    __obj.asInstanceOf[ICopyVaultJob]
  }
}

