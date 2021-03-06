package typings
package reduxDashFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reduxDashFormLibComponents {
  @scala.inline
  def Field[P /* <: reduxDashFormLib.libFieldMod.GenericFieldHTMLAttributes | reduxDashFormLib.libFieldMod.BaseFieldProps[js.Object] */]: reactLib.reactMod.ReactNs.ComponentType[P] = js.constructorOf[reduxDashFormLib.libFieldMod.default[P]].asInstanceOf[reactLib.reactMod.ReactNs.ComponentType[P]]
  @scala.inline
  def FieldArray[P]: reactLib.reactMod.ReactNs.ComponentType[reduxDashFormLib.libFieldArrayMod.BaseFieldArrayProps[P] with stdLib.Partial[P]] = js.constructorOf[reduxDashFormLib.immutableMod.FieldArray[P]].asInstanceOf[reactLib.reactMod.ReactNs.ComponentType[reduxDashFormLib.libFieldArrayMod.BaseFieldArrayProps[P] with stdLib.Partial[P]]]
  @scala.inline
  def Fields[P]: reactLib.reactMod.ReactNs.ComponentType[reduxDashFormLib.libFieldsMod.BaseFieldsProps[P] with P] = js.constructorOf[reduxDashFormLib.immutableMod.Fields[P]].asInstanceOf[reactLib.reactMod.ReactNs.ComponentType[reduxDashFormLib.libFieldsMod.BaseFieldsProps[P] with P]]
  @scala.inline
  def Form[FormData, P, ErrorType]: reactLib.reactMod.ReactNs.ComponentType[reduxDashFormLib.libFormMod.FormProps[FormData, P, ErrorType]] = js.constructorOf[reduxDashFormLib.libFormMod.Form[FormData, P, ErrorType]].asInstanceOf[reactLib.reactMod.ReactNs.ComponentType[reduxDashFormLib.libFormMod.FormProps[FormData, P, ErrorType]]]
  @scala.inline
  def FormName: reactLib.reactMod.ReactNs.ComponentType[reduxDashFormLib.libFormNameMod.FormNameProps] = reduxDashFormLib.libFormNameMod.^.default.asInstanceOf[reactLib.reactMod.ReactNs.ComponentType[reduxDashFormLib.libFormNameMod.FormNameProps]]
  @scala.inline
  def FormSection[P]: reactLib.reactMod.ReactNs.ComponentType[reduxDashFormLib.libFormSectionMod.FormSectionProps[P] with P] = js.constructorOf[reduxDashFormLib.libFormSectionMod.default[P]].asInstanceOf[reactLib.reactMod.ReactNs.ComponentType[reduxDashFormLib.libFormSectionMod.FormSectionProps[P] with P]]
  @scala.inline
  def GenericForm[FormData, P, ErrorType]: reactLib.reactMod.ReactNs.ComponentType[reduxDashFormLib.libFormMod.FormProps[FormData, P, ErrorType]] = js.constructorOf[reduxDashFormLib.libFormMod.GenericForm[FormData, P, ErrorType]].asInstanceOf[reactLib.reactMod.ReactNs.ComponentType[reduxDashFormLib.libFormMod.FormProps[FormData, P, ErrorType]]]
  @scala.inline
  def FormNameProps: reduxDashFormLib.libFormNameMod.FormNameProps.type = reduxDashFormLib.libFormNameMod.FormNameProps
  type FormNameProps = reduxDashFormLib.libFormNameMod.FormNameProps
  type FormProps[FormData, P, ErrorType] = reduxDashFormLib.libFormMod.FormProps[FormData, P, ErrorType]
}

