package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCPeerConnection extends EventTarget {
  val canTrickleIceCandidates: scala.Boolean | scala.Null = js.native
  val connectionState: RTCPeerConnectionState = js.native
  val currentLocalDescription: RTCSessionDescription | scala.Null = js.native
  val currentRemoteDescription: RTCSessionDescription | scala.Null = js.native
  val iceConnectionState: RTCIceConnectionState = js.native
  val iceGatheringState: RTCIceGatheringState = js.native
  val idpErrorInfo: java.lang.String | scala.Null = js.native
  val idpLoginUrl: java.lang.String | scala.Null = js.native
  val localDescription: RTCSessionDescription | scala.Null = js.native
  var onconnectionstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var ondatachannel: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCDataChannelEvent, _]) | scala.Null = js.native
  var onicecandidate: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, _]) | scala.Null = js.native
  var onicecandidateerror: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, _]) | scala.Null = js.native
  var oniceconnectionstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onicegatheringstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onnegotiationneeded: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onsignalingstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onstatsended: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCStatsEvent, _]) | scala.Null = js.native
  var ontrack: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, _]) | scala.Null = js.native
  val peerIdentity: Promise[RTCIdentityAssertion] = js.native
  val pendingLocalDescription: RTCSessionDescription | scala.Null = js.native
  val pendingRemoteDescription: RTCSessionDescription | scala.Null = js.native
  val remoteDescription: RTCSessionDescription | scala.Null = js.native
  val sctp: RTCSctpTransport | scala.Null = js.native
  val signalingState: RTCSignalingState = js.native
  @JSName("addEventListener")
  def addEventListener_connectionstatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionstatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionstatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datachannel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.datachannel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDataChannelEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datachannel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.datachannel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDataChannelEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datachannel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.datachannel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDataChannelEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidateerror(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidateerror(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidateerror(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_iceconnectionstatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_iceconnectionstatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_iceconnectionstatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icegatheringstatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icegatheringstatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icegatheringstatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_negotiationneeded(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_negotiationneeded(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_negotiationneeded(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_signalingstatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_signalingstatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_signalingstatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statsended(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.statsended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCStatsEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statsended(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.statsended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCStatsEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statsended(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.statsended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCStatsEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_track(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.track,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_track(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.track,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_track(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.track,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  def addIceCandidate(candidate: RTCIceCandidate): Promise[scala.Unit] = js.native
  def addIceCandidate(candidate: RTCIceCandidateInit): Promise[scala.Unit] = js.native
  def addTrack(track: MediaStreamTrack, streams: MediaStream*): RTCRtpSender = js.native
  def addTransceiver(trackOrKind: MediaStreamTrack): RTCRtpTransceiver = js.native
  def addTransceiver(trackOrKind: MediaStreamTrack, init: RTCRtpTransceiverInit): RTCRtpTransceiver = js.native
  def addTransceiver(trackOrKind: java.lang.String): RTCRtpTransceiver = js.native
  def addTransceiver(trackOrKind: java.lang.String, init: RTCRtpTransceiverInit): RTCRtpTransceiver = js.native
  def close(): scala.Unit = js.native
  def createAnswer(): Promise[RTCSessionDescriptionInit] = js.native
  def createAnswer(options: RTCOfferOptions): Promise[RTCSessionDescriptionInit] = js.native
  def createDataChannel(label: java.lang.String): RTCDataChannel = js.native
  def createDataChannel(label: java.lang.String, dataChannelDict: RTCDataChannelInit): RTCDataChannel = js.native
  def createOffer(): Promise[RTCSessionDescriptionInit] = js.native
  def createOffer(options: RTCOfferOptions): Promise[RTCSessionDescriptionInit] = js.native
  def getConfiguration(): RTCConfiguration = js.native
  def getIdentityAssertion(): Promise[java.lang.String] = js.native
  def getReceivers(): Array[RTCRtpReceiver] = js.native
  def getSenders(): Array[RTCRtpSender] = js.native
  def getStats(): Promise[RTCStatsReport] = js.native
  def getStats(selector: MediaStreamTrack): Promise[RTCStatsReport] = js.native
  def getTransceivers(): Array[RTCRtpTransceiver] = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionstatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionstatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionstatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_datachannel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.datachannel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDataChannelEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_datachannel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.datachannel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDataChannelEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_datachannel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.datachannel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDataChannelEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidateerror(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidateerror(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidateerror(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_iceconnectionstatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_iceconnectionstatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_iceconnectionstatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icegatheringstatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icegatheringstatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icegatheringstatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_negotiationneeded(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_negotiationneeded(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_negotiationneeded(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_signalingstatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_signalingstatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_signalingstatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statsended(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.statsended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCStatsEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statsended(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.statsended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCStatsEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statsended(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.statsended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCStatsEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_track(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.track,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_track(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.track,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_track(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.track,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  def removeTrack(sender: RTCRtpSender): scala.Unit = js.native
  def setConfiguration(configuration: RTCConfiguration): scala.Unit = js.native
  def setIdentityProvider(provider: java.lang.String): scala.Unit = js.native
  def setIdentityProvider(provider: java.lang.String, options: RTCIdentityProviderOptions): scala.Unit = js.native
  def setLocalDescription(description: RTCSessionDescriptionInit): Promise[scala.Unit] = js.native
  def setRemoteDescription(description: RTCSessionDescriptionInit): Promise[scala.Unit] = js.native
}

@JSGlobal("RTCPeerConnection")
@js.native
object RTCPeerConnection
  extends org.scalablytyped.runtime.Instantiable0[RTCPeerConnection]
     with org.scalablytyped.runtime.Instantiable1[/* configuration */ RTCConfiguration, RTCPeerConnection] {
  def generateCertificate(keygenAlgorithm: atSindresorhusIsLib.AlgorithmIdentifier): atSindresorhusIsLib.Promise[atSindresorhusIsLib.RTCCertificate] = js.native
  def getDefaultIceServers(): atSindresorhusIsLib.Array[atSindresorhusIsLib.RTCIceServer] = js.native
}

