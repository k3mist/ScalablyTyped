package typings
package gapiDotClientDotSurveysLib.gapiNs.clientNs.surveysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurveyRejection extends js.Object {
  /** A human-readable explanation of what was wrong with the survey. */
  var explanation: js.UndefOr[java.lang.String] = js.undefined
  /** Which category of rejection this was. See the  Google Surveys Help Center for additional details on each category. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object SurveyRejection {
  @scala.inline
  def apply(explanation: java.lang.String = null, `type`: java.lang.String = null): SurveyRejection = {
    val __obj = js.Dynamic.literal()
    if (explanation != null) __obj.updateDynamic("explanation")(explanation)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SurveyRejection]
  }
}

