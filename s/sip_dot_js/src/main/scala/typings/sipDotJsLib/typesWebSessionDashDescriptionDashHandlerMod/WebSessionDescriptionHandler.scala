package typings
package sipDotJsLib.typesWebSessionDashDescriptionDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/Web/session-description-handler", "WebSessionDescriptionHandler")
@js.native
class WebSessionDescriptionHandler protected ()
  extends nodeLib.eventsMod.EventEmitter
     with sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler {
    // peer connection is created in constructor, and never unset
  def this(logger: sipDotJsLib.typesLoggerDashFactoryMod.Logger, observer: sipDotJsLib.typesSessionDashDescriptionDashHandlerDashObserverMod.SessionDescriptionHandlerObserver, options: js.Any) = this()
  var peerConnection: stdLib.RTCPeerConnection = js.native
  var `type`: sipDotJsLib.typesEnumsMod.TypeStrings = js.native
  def getDescription(options: WebSessionDescriptionHandlerOptions): js.Promise[sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.BodyObj] = js.native
  def getDescription(
    options: WebSessionDescriptionHandlerOptions,
    modifiers: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
  ): js.Promise[sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.BodyObj] = js.native
  def getDirection(): java.lang.String = js.native
  @JSName("on")
  def on_addStream(
    event: sipDotJsLib.sipDotJsLibStrings.addStream,
    listener: js.Function1[/* track */ stdLib.MediaStream, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_addTrack(
    event: sipDotJsLib.sipDotJsLibStrings.addTrack,
    listener: js.Function1[/* track */ stdLib.MediaStreamTrack, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_confirmed(
    event: sipDotJsLib.sipDotJsLibStrings.confirmed,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_getDescription(
    event: sipDotJsLib.sipDotJsLibStrings.getDescription,
    listener: js.Function1[/* description */ stdLib.RTCSessionDescriptionInit, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceCandidate(
    event: sipDotJsLib.sipDotJsLibStrings.iceCandidate,
    listener: js.Function1[/* candidate */ stdLib.RTCIceCandidate, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceConectionClosed(
    event: sipDotJsLib.sipDotJsLibStrings.iceConectionClosed,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceConnection(
    event: sipDotJsLib.sipDotJsLibStrings.iceConnection,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceConnectionChecking(
    event: sipDotJsLib.sipDotJsLibStrings.iceConnectionChecking,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceConnectionCompleted(
    event: sipDotJsLib.sipDotJsLibStrings.iceConnectionCompleted,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceConnectionConnected(
    event: sipDotJsLib.sipDotJsLibStrings.iceConnectionConnected,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceConnectionDisconnected(
    event: sipDotJsLib.sipDotJsLibStrings.iceConnectionDisconnected,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceConnectionFailed(
    event: sipDotJsLib.sipDotJsLibStrings.iceConnectionFailed,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceGathering(
    event: sipDotJsLib.sipDotJsLibStrings.iceGathering,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceGatheringComplete(
    event: sipDotJsLib.sipDotJsLibStrings.iceGatheringComplete,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): this.type = js.native
   // TODO:
  @JSName("on")
  def `on_peerConnection-SetLocalDescriptionFailed`(
    event: sipDotJsLib.sipDotJsLibStrings.`peerConnection-SetLocalDescriptionFailed`,
    listener: js.Function1[/* error */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def `on_peerConnection-createAnswerFailed`(
    event: sipDotJsLib.sipDotJsLibStrings.`peerConnection-createAnswerFailed`,
    listener: js.Function1[/* error */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def `on_peerConnection-createOfferFailed`(
    event: sipDotJsLib.sipDotJsLibStrings.`peerConnection-createOfferFailed`,
    listener: js.Function1[/* error */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def `on_peerConnection-setRemoteDescriptionFailed`(
    event: sipDotJsLib.sipDotJsLibStrings.`peerConnection-setRemoteDescriptionFailed`,
    listener: js.Function1[/* error */ js.Any, scala.Unit]
  ): this.type = js.native
   // TODO: SessionDescriptionHandlerException
  @JSName("on")
  def on_setDescription(
    event: sipDotJsLib.sipDotJsLibStrings.setDescription,
    listener: js.Function1[/* description */ stdLib.RTCSessionDescriptionInit, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_setRemoteDescription(
    event: sipDotJsLib.sipDotJsLibStrings.setRemoteDescription,
    listener: js.Function1[/* receivers */ js.Array[stdLib.RTCRtpReceiver], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_userMedia(
    event: sipDotJsLib.sipDotJsLibStrings.userMedia,
    listener: js.Function1[/* streams */ stdLib.MediaStream, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_userMediaFailed(
    event: sipDotJsLib.sipDotJsLibStrings.userMediaFailed,
    listener: js.Function1[/* error */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_userMediaRequest(
    event: sipDotJsLib.sipDotJsLibStrings.userMediaRequest,
    listener: js.Function1[/* constraints */ stdLib.MediaStreamConstraints, scala.Unit]
  ): this.type = js.native
  def setDescription(sdp: java.lang.String, options: WebSessionDescriptionHandlerOptions): js.Promise[scala.Unit] = js.native
  def setDescription(
    sdp: java.lang.String,
    options: WebSessionDescriptionHandlerOptions,
    modifiers: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
  ): js.Promise[scala.Unit] = js.native
}

/* static members */
@JSImport("sip.js/types/Web/session-description-handler", "WebSessionDescriptionHandler")
@js.native
object WebSessionDescriptionHandler extends js.Object {
  def defaultFactory(session: sipDotJsLib.typesSessionMod.InviteClientContext, options: js.Any): sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler = js.native
  def defaultFactory(session: sipDotJsLib.typesSessionMod.InviteServerContext, options: js.Any): sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler = js.native
}

