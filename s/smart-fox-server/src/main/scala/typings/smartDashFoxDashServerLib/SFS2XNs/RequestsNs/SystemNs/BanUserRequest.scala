package typings
package smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.System.BanUserRequest")
@js.native
class BanUserRequest protected () extends js.Object {
  /**
    * Creates a new BanUserRequest instance.
    * @param {number}  userId        The id of the user to be banned.
    * @param {string}  [message=null]       A custom message to be delivered to the user before banning him; if null, the default message configured in the SmartFoxServer 2X Administration Tool is used.
    * @param {BanMode} [banMode=BY_NAME]       One of the ban modes defined in the BanMode class.
    * @param {number}  [delaySeconds=5]  The number of seconds after which the user is banned after receiving the ban message.
    * @param {number}  [durationHours=24] The duration of the banishment, expressed in hours.
    */
  def this(userId: scala.Double) = this()
  def this(userId: scala.Double, message: java.lang.String) = this()
  def this(userId: scala.Double, message: java.lang.String, banMode: smartDashFoxDashServerLib.SFS2XNs.RequestsNs.BanMode) = this()
  def this(userId: scala.Double, message: java.lang.String, banMode: smartDashFoxDashServerLib.SFS2XNs.RequestsNs.BanMode, delaySeconds: scala.Double) = this()
  def this(userId: scala.Double, message: java.lang.String, banMode: smartDashFoxDashServerLib.SFS2XNs.RequestsNs.BanMode, delaySeconds: scala.Double, durationHours: scala.Double) = this()
}

