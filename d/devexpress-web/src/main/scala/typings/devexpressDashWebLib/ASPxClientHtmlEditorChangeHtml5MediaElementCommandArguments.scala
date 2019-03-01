package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base class for parameters related to inserting or changing HTML5 media elements (Audio and Video) in the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorChangeHtml5MediaElementCommandArguments extends ASPxClientHtmlEditorChangeMediaElementCommandArguments {
  /**
    * Determines if a media file will start playing automatically.
    * Value: true, if autoplay is enabled; otherwise, false.
    */
  var autoPlay: scala.Boolean
  /**
    * Determines if a media file repeats indefinitely, or stops when it reaches the last frame.
    * Value: true, to loop playback; otherwise, false.
    */
  var loop: scala.Boolean
  /**
    * Determines how a media file should be loaded when the page loads.
    * Value: One of the ASPxClientHtmlEditorMediaPreloadMode enumeration values.
    */
  var preloadMode: java.lang.String
  /**
    * Determines if the media player controls should be displayed.
    * Value: true, if media player controls are displayed; otherwise, false.
    */
  var showPlayerControls: scala.Boolean
}

object ASPxClientHtmlEditorChangeHtml5MediaElementCommandArguments {
  @scala.inline
  def apply(
    GetCommandName: js.Function0[java.lang.String],
    align: java.lang.String,
    autoPlay: scala.Boolean,
    id: java.lang.String,
    loop: scala.Boolean,
    preloadMode: java.lang.String,
    selectedElement: js.Object,
    showPlayerControls: scala.Boolean,
    src: java.lang.String,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  ): ASPxClientHtmlEditorChangeHtml5MediaElementCommandArguments = {
    val __obj = js.Dynamic.literal(GetCommandName = GetCommandName, align = align, autoPlay = autoPlay, id = id, loop = loop, preloadMode = preloadMode, selectedElement = selectedElement, showPlayerControls = showPlayerControls, src = src, styleSettings = styleSettings)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorChangeHtml5MediaElementCommandArguments]
  }
}

