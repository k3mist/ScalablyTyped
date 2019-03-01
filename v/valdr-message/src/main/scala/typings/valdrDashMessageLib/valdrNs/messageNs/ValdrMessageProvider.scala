package typings
package valdrDashMessageLib.valdrNs.messageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValdrMessageProvider extends js.Object {
  /**
    * Adds messages for AngularJS build-in validators (eg "required" and "number") or for specific fields (eg "Person.lastName.required").
    * @param messages the list of key/value pairs.
    */
  def addMessages(messages: org.scalablytyped.runtime.StringDictionary[java.lang.String]): scala.Unit
  /**
    * Gets the validator message.
    * @param typeName the name of the type.
    * @param fieldName the name of the field.
    * @param validatorName the name of the validator.
    * @returns {string} the message.
    */
  def getMessage(typeName: java.lang.String, fieldName: java.lang.String, validatorName: java.lang.String): java.lang.String
  /**
    * Sets the default message template.
    * @param template the default message template (eg "<div class="valdr-message">{{ violation.message }}</div>").
    */
  def setTemplate(template: java.lang.String): scala.Unit
  /**
    * Sets the URL for the default message template (eg "/partials/valdrMessageTemplate.html").
    * @param url the URL of the default message template.
    */
  def setTemplateUrl(url: java.lang.String): scala.Unit
}

object ValdrMessageProvider {
  @scala.inline
  def apply(
    addMessages: js.Function1[org.scalablytyped.runtime.StringDictionary[java.lang.String], scala.Unit],
    getMessage: js.Function3[java.lang.String, java.lang.String, java.lang.String, java.lang.String],
    setTemplate: js.Function1[java.lang.String, scala.Unit],
    setTemplateUrl: js.Function1[java.lang.String, scala.Unit]
  ): ValdrMessageProvider = {
    val __obj = js.Dynamic.literal(addMessages = addMessages, getMessage = getMessage, setTemplate = setTemplate, setTemplateUrl = setTemplateUrl)
  
    __obj.asInstanceOf[ValdrMessageProvider]
  }
}

