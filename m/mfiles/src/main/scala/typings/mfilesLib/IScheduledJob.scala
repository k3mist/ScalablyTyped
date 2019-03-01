package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduledJob extends js.Object {
  val BackupVaultJob: IBackupJob
  var Enabled: scala.Boolean
  val ExportContentJob: IExportContentJob
  var ID: scala.Double
  val ImportContentJob: IImportContentJob
  var JobName: java.lang.String
  var JobType: mfilesLib.MFilesNs.MFScheduledJobType
  val OptimizeVaultJob: IOptimizeVaultJob
  var Temporary: scala.Boolean
  var Triggers: IScheduledJobTriggers
  def SetBackupVaultJob(BackupVaultJob: IBackupJob): scala.Unit
  def SetExportContentJob(ExportContentJob: IExportContentJob): scala.Unit
  def SetImportContentJob(ImportContentJob: IImportContentJob): scala.Unit
  def SetOptimizeVaultJob(OptimizeVaultJob: IOptimizeVaultJob): scala.Unit
}

object IScheduledJob {
  @scala.inline
  def apply(
    BackupVaultJob: IBackupJob,
    Enabled: scala.Boolean,
    ExportContentJob: IExportContentJob,
    ID: scala.Double,
    ImportContentJob: IImportContentJob,
    JobName: java.lang.String,
    JobType: mfilesLib.MFilesNs.MFScheduledJobType,
    OptimizeVaultJob: IOptimizeVaultJob,
    SetBackupVaultJob: js.Function1[IBackupJob, scala.Unit],
    SetExportContentJob: js.Function1[IExportContentJob, scala.Unit],
    SetImportContentJob: js.Function1[IImportContentJob, scala.Unit],
    SetOptimizeVaultJob: js.Function1[IOptimizeVaultJob, scala.Unit],
    Temporary: scala.Boolean,
    Triggers: IScheduledJobTriggers
  ): IScheduledJob = {
    val __obj = js.Dynamic.literal(BackupVaultJob = BackupVaultJob, Enabled = Enabled, ExportContentJob = ExportContentJob, ID = ID, ImportContentJob = ImportContentJob, JobName = JobName, JobType = JobType, OptimizeVaultJob = OptimizeVaultJob, SetBackupVaultJob = SetBackupVaultJob, SetExportContentJob = SetExportContentJob, SetImportContentJob = SetImportContentJob, SetOptimizeVaultJob = SetOptimizeVaultJob, Temporary = Temporary, Triggers = Triggers)
  
    __obj.asInstanceOf[IScheduledJob]
  }
}

