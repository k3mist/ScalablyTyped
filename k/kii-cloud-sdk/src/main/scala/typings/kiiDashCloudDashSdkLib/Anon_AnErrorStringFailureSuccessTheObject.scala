package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureSuccessTheObject extends js.Object {
  def failure(theObject: kiiDashCloudDashSdkLib.KiiCloudNs.KiiObject, anErrorString: java.lang.String): js.Any
  def success(theRefreshedObject: kiiDashCloudDashSdkLib.KiiCloudNs.KiiObject): js.Any
}

object Anon_AnErrorStringFailureSuccessTheObject {
  @scala.inline
  def apply(
    failure: js.Function2[kiiDashCloudDashSdkLib.KiiCloudNs.KiiObject, java.lang.String, js.Any],
    success: js.Function1[kiiDashCloudDashSdkLib.KiiCloudNs.KiiObject, js.Any]
  ): Anon_AnErrorStringFailureSuccessTheObject = {
    val __obj = js.Dynamic.literal(failure = failure, success = success)
  
    __obj.asInstanceOf[Anon_AnErrorStringFailureSuccessTheObject]
  }
}

