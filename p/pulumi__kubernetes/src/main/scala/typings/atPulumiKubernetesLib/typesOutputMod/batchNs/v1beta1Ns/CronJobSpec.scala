package typings
package atPulumiKubernetesLib.typesOutputMod.batchNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CronJobSpec describes how the job execution will look like and when it will actually run.
  */
trait CronJobSpec extends js.Object {
  /**
    * Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow"
    * (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs,
    * skipping next run if previous run hasn't finished yet; - "Replace": cancels currently
    * running job and replaces it with a new one
    */
  val concurrencyPolicy: java.lang.String
  /**
    * The number of failed finished jobs to retain. This is a pointer to distinguish between
    * explicit zero and not specified. Defaults to 1.
    */
  val failedJobsHistoryLimit: scala.Double
  /**
    * Specifies the job that will be created when executing a CronJob.
    */
  val jobTemplate: JobTemplateSpec
  /**
    * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
    */
  val schedule: java.lang.String
  /**
    * Optional deadline in seconds for starting the job if it misses scheduled time for any
    * reason.  Missed jobs executions will be counted as failed ones.
    */
  val startingDeadlineSeconds: scala.Double
  /**
    * The number of successful finished jobs to retain. This is a pointer to distinguish between
    * explicit zero and not specified. Defaults to 3.
    */
  val successfulJobsHistoryLimit: scala.Double
  /**
    * This flag tells the controller to suspend subsequent executions, it does not apply to
    * already started executions.  Defaults to false.
    */
  val suspend: scala.Boolean
}

object CronJobSpec {
  @scala.inline
  def apply(
    concurrencyPolicy: java.lang.String,
    failedJobsHistoryLimit: scala.Double,
    jobTemplate: JobTemplateSpec,
    schedule: java.lang.String,
    startingDeadlineSeconds: scala.Double,
    successfulJobsHistoryLimit: scala.Double,
    suspend: scala.Boolean
  ): CronJobSpec = {
    val __obj = js.Dynamic.literal(concurrencyPolicy = concurrencyPolicy, failedJobsHistoryLimit = failedJobsHistoryLimit, jobTemplate = jobTemplate, schedule = schedule, startingDeadlineSeconds = startingDeadlineSeconds, successfulJobsHistoryLimit = successfulJobsHistoryLimit, suspend = suspend)
  
    __obj.asInstanceOf[CronJobSpec]
  }
}

