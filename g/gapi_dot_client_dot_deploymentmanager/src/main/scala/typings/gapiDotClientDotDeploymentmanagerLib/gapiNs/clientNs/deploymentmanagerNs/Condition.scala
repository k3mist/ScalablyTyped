package typings
package gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Condition extends js.Object {
  /** Trusted attributes supplied by the IAM system. */
  var iam: js.UndefOr[java.lang.String] = js.undefined
  /** An operator to apply the subject with. */
  var op: js.UndefOr[java.lang.String] = js.undefined
  /** Trusted attributes discharged by the service. */
  var svc: js.UndefOr[java.lang.String] = js.undefined
  /** Trusted attributes supplied by any service that owns resources and uses the IAM system for access control. */
  var sys: js.UndefOr[java.lang.String] = js.undefined
  /** DEPRECATED. Use 'values' instead. */
  var value: js.UndefOr[java.lang.String] = js.undefined
  /** The objects of the condition. This is mutually exclusive with 'value'. */
  var values: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Condition {
  @scala.inline
  def apply(
    iam: java.lang.String = null,
    op: java.lang.String = null,
    svc: java.lang.String = null,
    sys: java.lang.String = null,
    value: java.lang.String = null,
    values: js.Array[java.lang.String] = null
  ): Condition = {
    val __obj = js.Dynamic.literal()
    if (iam != null) __obj.updateDynamic("iam")(iam)
    if (op != null) __obj.updateDynamic("op")(op)
    if (svc != null) __obj.updateDynamic("svc")(svc)
    if (sys != null) __obj.updateDynamic("sys")(sys)
    if (value != null) __obj.updateDynamic("value")(value)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[Condition]
  }
}

