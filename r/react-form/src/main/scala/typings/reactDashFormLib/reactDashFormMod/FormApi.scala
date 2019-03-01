package typings
package reactDashFormLib.reactDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormApi extends js.Object {
  var asyncValidations: scala.Double
  var errors: FormErrors
  var submits: scala.Double
  var submitted: scala.Boolean
  var successes: FormErrors
  var touched: Touched
  var validating: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  var validationFailed: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  var validationFailures: scala.Double
  // State
  var values: FormValues
  var warnings: FormErrors
  def addValue(name: java.lang.String, value: js.Any): scala.Unit
  def getFormState(): FormState
  def removeValue(name: java.lang.String, index: scala.Double): scala.Unit
  def resetAll(): scala.Unit
  def setAllTouched(touches: org.scalablytyped.runtime.StringDictionary[scala.Boolean]): scala.Unit
  def setAllValues(values: FormValues): scala.Unit
  def setError(field: java.lang.String, error: java.lang.String): scala.Unit
  def setFormState(state: FormState): scala.Unit
  def setSuccess(field: java.lang.String, success: java.lang.String): scala.Unit
  def setTouched(field: java.lang.String, touched: scala.Boolean): scala.Unit
  def setValue(fieldName: java.lang.String, value: js.Any): scala.Unit
  def setWarning(field: java.lang.String, warning: java.lang.String): scala.Unit
  // Methods
  def submitForm(event: reactLib.reactMod.ReactNs.SyntheticEvent[_, reactLib.Event]): scala.Unit
  def swapValues(name: java.lang.String, index1: scala.Double, index2: scala.Double): scala.Unit
}

object FormApi {
  @scala.inline
  def apply(
    addValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    asyncValidations: scala.Double,
    errors: FormErrors,
    getFormState: js.Function0[FormState],
    removeValue: js.Function2[java.lang.String, scala.Double, scala.Unit],
    resetAll: js.Function0[scala.Unit],
    setAllTouched: js.Function1[org.scalablytyped.runtime.StringDictionary[scala.Boolean], scala.Unit],
    setAllValues: js.Function1[FormValues, scala.Unit],
    setError: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setFormState: js.Function1[FormState, scala.Unit],
    setSuccess: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setTouched: js.Function2[java.lang.String, scala.Boolean, scala.Unit],
    setValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setWarning: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    submitForm: js.Function1[reactLib.reactMod.ReactNs.SyntheticEvent[_, reactLib.Event], scala.Unit],
    submits: scala.Double,
    submitted: scala.Boolean,
    successes: FormErrors,
    swapValues: js.Function3[java.lang.String, scala.Double, scala.Double, scala.Unit],
    touched: Touched,
    validating: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    validationFailed: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    validationFailures: scala.Double,
    values: FormValues,
    warnings: FormErrors
  ): FormApi = {
    val __obj = js.Dynamic.literal(addValue = addValue, asyncValidations = asyncValidations, errors = errors, getFormState = getFormState, removeValue = removeValue, resetAll = resetAll, setAllTouched = setAllTouched, setAllValues = setAllValues, setError = setError, setFormState = setFormState, setSuccess = setSuccess, setTouched = setTouched, setValue = setValue, setWarning = setWarning, submitForm = submitForm, submits = submits, submitted = submitted, successes = successes, swapValues = swapValues, touched = touched, validating = validating, validationFailed = validationFailed, validationFailures = validationFailures, values = values, warnings = warnings)
  
    __obj.asInstanceOf[FormApi]
  }
}

