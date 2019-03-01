package typings
package winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a constraint for a SpeechRecognizer object. */
trait ISpeechRecognitionConstraint extends js.Object {
  /** Gets or sets whether the constraint can be used by the SpeechRecognizer object to perform recognition. */
  var isEnabled: scala.Boolean
  /** Gets or sets the weighted value of the constraint. */
  var probability: SpeechRecognitionConstraintProbability
  /** Gets or sets a tag that can be useful for identifying the constraint. */
  var tag: java.lang.String
  /** Gets the type of the constraint. */
  var `type`: SpeechRecognitionConstraintType
}

object ISpeechRecognitionConstraint {
  @scala.inline
  def apply(
    isEnabled: scala.Boolean,
    probability: SpeechRecognitionConstraintProbability,
    tag: java.lang.String,
    `type`: SpeechRecognitionConstraintType
  ): ISpeechRecognitionConstraint = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled, probability = probability, tag = tag, `type` = `type`)
  
    __obj.asInstanceOf[ISpeechRecognitionConstraint]
  }
}

