package typings
package gapiDotClientDotYoutubereportingLib.gapiNs.clientNs.youtubereportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Job extends js.Object {
  /** The creation date/time of the job. */
  var createTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The date/time when this job will expire/expired. After a job expired, no
    * new reports are generated.
    */
  var expireTime: js.UndefOr[java.lang.String] = js.undefined
  /** The server-generated ID of the job (max. 40 characters). */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the job (max. 100 characters). */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of reports this job creates. Corresponds to the ID of a
    * ReportType.
    */
  var reportTypeId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * True if this a system-managed job that cannot be modified by the user;
    * otherwise false.
    */
  var systemManaged: js.UndefOr[scala.Boolean] = js.undefined
}

object Job {
  @scala.inline
  def apply(
    createTime: java.lang.String = null,
    expireTime: java.lang.String = null,
    id: java.lang.String = null,
    name: java.lang.String = null,
    reportTypeId: java.lang.String = null,
    systemManaged: js.UndefOr[scala.Boolean] = js.undefined
  ): Job = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime)
    if (expireTime != null) __obj.updateDynamic("expireTime")(expireTime)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (reportTypeId != null) __obj.updateDynamic("reportTypeId")(reportTypeId)
    if (!js.isUndefined(systemManaged)) __obj.updateDynamic("systemManaged")(systemManaged)
    __obj.asInstanceOf[Job]
  }
}

