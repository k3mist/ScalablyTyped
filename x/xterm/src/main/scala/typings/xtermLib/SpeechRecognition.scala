package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechRecognition extends EventTarget {
  var continuous: scala.Boolean = js.native
  var grammars: SpeechGrammarList = js.native
  var interimResults: scala.Boolean = js.native
  var lang: java.lang.String = js.native
  var maxAlternatives: scala.Double = js.native
  var onaudioend: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onaudiostart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onend: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionError, _]) | scala.Null = js.native
  var onnomatch: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _]) | scala.Null = js.native
  var onresult: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _]) | scala.Null = js.native
  var onsoundend: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onsoundstart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onspeechend: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onspeechstart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onstart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var serviceURI: java.lang.String = js.native
  def abort(): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audioend(
    `type`: xtermLib.xtermLibStrings.audioend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audioend(
    `type`: xtermLib.xtermLibStrings.audioend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audioend(
    `type`: xtermLib.xtermLibStrings.audioend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audiostart(
    `type`: xtermLib.xtermLibStrings.audiostart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audiostart(
    `type`: xtermLib.xtermLibStrings.audiostart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audiostart(
    `type`: xtermLib.xtermLibStrings.audiostart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_end(
    `type`: xtermLib.xtermLibStrings.end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_end(
    `type`: xtermLib.xtermLibStrings.end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_end(
    `type`: xtermLib.xtermLibStrings.end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: xtermLib.xtermLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionError, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: xtermLib.xtermLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionError, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: xtermLib.xtermLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionError, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_nomatch(
    `type`: xtermLib.xtermLibStrings.nomatch,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_nomatch(
    `type`: xtermLib.xtermLibStrings.nomatch,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_nomatch(
    `type`: xtermLib.xtermLibStrings.nomatch,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_result(
    `type`: xtermLib.xtermLibStrings.result,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_result(
    `type`: xtermLib.xtermLibStrings.result,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_result(
    `type`: xtermLib.xtermLibStrings.result,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_soundend(
    `type`: xtermLib.xtermLibStrings.soundend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_soundend(
    `type`: xtermLib.xtermLibStrings.soundend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_soundend(
    `type`: xtermLib.xtermLibStrings.soundend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_soundstart(
    `type`: xtermLib.xtermLibStrings.soundstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_soundstart(
    `type`: xtermLib.xtermLibStrings.soundstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_soundstart(
    `type`: xtermLib.xtermLibStrings.soundstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_speechend(
    `type`: xtermLib.xtermLibStrings.speechend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_speechend(
    `type`: xtermLib.xtermLibStrings.speechend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_speechend(
    `type`: xtermLib.xtermLibStrings.speechend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_speechstart(
    `type`: xtermLib.xtermLibStrings.speechstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_speechstart(
    `type`: xtermLib.xtermLibStrings.speechstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_speechstart(
    `type`: xtermLib.xtermLibStrings.speechstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: xtermLib.xtermLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: xtermLib.xtermLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: xtermLib.xtermLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audioend(
    `type`: xtermLib.xtermLibStrings.audioend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audioend(
    `type`: xtermLib.xtermLibStrings.audioend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audioend(
    `type`: xtermLib.xtermLibStrings.audioend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audiostart(
    `type`: xtermLib.xtermLibStrings.audiostart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audiostart(
    `type`: xtermLib.xtermLibStrings.audiostart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audiostart(
    `type`: xtermLib.xtermLibStrings.audiostart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_end(
    `type`: xtermLib.xtermLibStrings.end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_end(
    `type`: xtermLib.xtermLibStrings.end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_end(
    `type`: xtermLib.xtermLibStrings.end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: xtermLib.xtermLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionError, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: xtermLib.xtermLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionError, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: xtermLib.xtermLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionError, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_nomatch(
    `type`: xtermLib.xtermLibStrings.nomatch,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_nomatch(
    `type`: xtermLib.xtermLibStrings.nomatch,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_nomatch(
    `type`: xtermLib.xtermLibStrings.nomatch,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_result(
    `type`: xtermLib.xtermLibStrings.result,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_result(
    `type`: xtermLib.xtermLibStrings.result,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_result(
    `type`: xtermLib.xtermLibStrings.result,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_soundend(
    `type`: xtermLib.xtermLibStrings.soundend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_soundend(
    `type`: xtermLib.xtermLibStrings.soundend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_soundend(
    `type`: xtermLib.xtermLibStrings.soundend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_soundstart(
    `type`: xtermLib.xtermLibStrings.soundstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_soundstart(
    `type`: xtermLib.xtermLibStrings.soundstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_soundstart(
    `type`: xtermLib.xtermLibStrings.soundstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_speechend(
    `type`: xtermLib.xtermLibStrings.speechend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_speechend(
    `type`: xtermLib.xtermLibStrings.speechend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_speechend(
    `type`: xtermLib.xtermLibStrings.speechend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_speechstart(
    `type`: xtermLib.xtermLibStrings.speechstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_speechstart(
    `type`: xtermLib.xtermLibStrings.speechstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_speechstart(
    `type`: xtermLib.xtermLibStrings.speechstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: xtermLib.xtermLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: xtermLib.xtermLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: xtermLib.xtermLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  def start(): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

@JSGlobal("SpeechRecognition")
@js.native
object SpeechRecognition
  extends org.scalablytyped.runtime.Instantiable0[SpeechRecognition]

