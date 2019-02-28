package typings
package sarifLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object sarifLibStrings {
  @js.native
  sealed trait `2DOT0DOT0-csdDOT2DOTbetaDOT2019-01-24` extends js.Object
  
  @js.native
  sealed trait absent
    extends sarifLib.sarifMod.ResultNs.baselineState
  
  @js.native
  sealed trait addedFile
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait analysisTarget
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait attachment
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait deletedFile
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait error
    extends sarifLib.sarifMod.NotificationNs.level
       with sarifLib.sarifMod.ReportingConfigurationNs.level
       with sarifLib.sarifMod.ResultNs.level
  
  @js.native
  sealed trait essential
    extends sarifLib.sarifMod.ThreadFlowLocationNs.importance
  
  @js.native
  sealed trait fail
    extends sarifLib.sarifMod.ResultNs.kind
  
  @js.native
  sealed trait important
    extends sarifLib.sarifMod.ThreadFlowLocationNs.importance
  
  @js.native
  sealed trait modifiedFile
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait `new`
    extends sarifLib.sarifMod.ResultNs.baselineState
  
  @js.native
  sealed trait none
    extends sarifLib.sarifMod.ResultNs.kind
       with sarifLib.sarifMod.NotificationNs.level
       with sarifLib.sarifMod.ReportingConfigurationNs.level
       with sarifLib.sarifMod.ResultNs.level
  
  @js.native
  sealed trait notApplicable
    extends sarifLib.sarifMod.ResultNs.kind
  
  @js.native
  sealed trait note
    extends sarifLib.sarifMod.NotificationNs.level
       with sarifLib.sarifMod.ReportingConfigurationNs.level
       with sarifLib.sarifMod.ResultNs.level
  
  @js.native
  sealed trait open
    extends sarifLib.sarifMod.ResultNs.kind
  
  @js.native
  sealed trait pass
    extends sarifLib.sarifMod.ResultNs.kind
  
  @js.native
  sealed trait renamedFile
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait responseFile
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait resultFile
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait review
    extends sarifLib.sarifMod.ResultNs.kind
  
  @js.native
  sealed trait standardStream
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait suppressedExternally
    extends sarifLib.sarifMod.ResultNs.suppressionStates
  
  @js.native
  sealed trait suppressedInSource
    extends sarifLib.sarifMod.ResultNs.suppressionStates
  
  @js.native
  sealed trait toolComponent
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait traceFile
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait unchanged
    extends sarifLib.sarifMod.ResultNs.baselineState
  
  @js.native
  sealed trait uncontrolledFile
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait unicodeCodePoints
    extends sarifLib.sarifMod.RunNs.columnKind
  
  @js.native
  sealed trait unimportant
    extends sarifLib.sarifMod.ThreadFlowLocationNs.importance
  
  @js.native
  sealed trait unmodifiedFile
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait updated
    extends sarifLib.sarifMod.ResultNs.baselineState
  
  @js.native
  sealed trait utf16CodeUnits
    extends sarifLib.sarifMod.RunNs.columnKind
  
  @js.native
  sealed trait warning
    extends sarifLib.sarifMod.NotificationNs.level
       with sarifLib.sarifMod.ReportingConfigurationNs.level
       with sarifLib.sarifMod.ResultNs.level
  
  @scala.inline
  def `2DOT0DOT0-csdDOT2DOTbetaDOT2019-01-24`: `2DOT0DOT0-csdDOT2DOTbetaDOT2019-01-24` = "2.0.0-csd.2.beta.2019-01-24".asInstanceOf[`2DOT0DOT0-csdDOT2DOTbetaDOT2019-01-24`]
  @scala.inline
  def absent: absent = "absent".asInstanceOf[absent]
  @scala.inline
  def addedFile: addedFile = "addedFile".asInstanceOf[addedFile]
  @scala.inline
  def analysisTarget: analysisTarget = "analysisTarget".asInstanceOf[analysisTarget]
  @scala.inline
  def attachment: attachment = "attachment".asInstanceOf[attachment]
  @scala.inline
  def deletedFile: deletedFile = "deletedFile".asInstanceOf[deletedFile]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def essential: essential = "essential".asInstanceOf[essential]
  @scala.inline
  def fail: fail = "fail".asInstanceOf[fail]
  @scala.inline
  def important: important = "important".asInstanceOf[important]
  @scala.inline
  def modifiedFile: modifiedFile = "modifiedFile".asInstanceOf[modifiedFile]
  @scala.inline
  def `new`: `new` = "new".asInstanceOf[`new`]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def notApplicable: notApplicable = "notApplicable".asInstanceOf[notApplicable]
  @scala.inline
  def note: note = "note".asInstanceOf[note]
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  @scala.inline
  def pass: pass = "pass".asInstanceOf[pass]
  @scala.inline
  def renamedFile: renamedFile = "renamedFile".asInstanceOf[renamedFile]
  @scala.inline
  def responseFile: responseFile = "responseFile".asInstanceOf[responseFile]
  @scala.inline
  def resultFile: resultFile = "resultFile".asInstanceOf[resultFile]
  @scala.inline
  def review: review = "review".asInstanceOf[review]
  @scala.inline
  def standardStream: standardStream = "standardStream".asInstanceOf[standardStream]
  @scala.inline
  def suppressedExternally: suppressedExternally = "suppressedExternally".asInstanceOf[suppressedExternally]
  @scala.inline
  def suppressedInSource: suppressedInSource = "suppressedInSource".asInstanceOf[suppressedInSource]
  @scala.inline
  def toolComponent: toolComponent = "toolComponent".asInstanceOf[toolComponent]
  @scala.inline
  def traceFile: traceFile = "traceFile".asInstanceOf[traceFile]
  @scala.inline
  def unchanged: unchanged = "unchanged".asInstanceOf[unchanged]
  @scala.inline
  def uncontrolledFile: uncontrolledFile = "uncontrolledFile".asInstanceOf[uncontrolledFile]
  @scala.inline
  def unicodeCodePoints: unicodeCodePoints = "unicodeCodePoints".asInstanceOf[unicodeCodePoints]
  @scala.inline
  def unimportant: unimportant = "unimportant".asInstanceOf[unimportant]
  @scala.inline
  def unmodifiedFile: unmodifiedFile = "unmodifiedFile".asInstanceOf[unmodifiedFile]
  @scala.inline
  def updated: updated = "updated".asInstanceOf[updated]
  @scala.inline
  def utf16CodeUnits: utf16CodeUnits = "utf16CodeUnits".asInstanceOf[utf16CodeUnits]
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
}

