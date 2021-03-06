package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates an instance of a service that uses DNS Service Discovery (DNS-SD). */
@JSGlobal("Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceInstance")
@js.native
class DnssdServiceInstance protected () extends js.Object {
  /**
    * Creates a new DnssdServiceInstance object with the specified instance name, host name, and port.
    * @param DnssdServiceInstanceName The service instance name for the service instance being created.
    * @param hostName The hostname for the service instance being created.
    * @param port The port number for the service instance being created.
    */
  def this(DnssdServiceInstanceName: java.lang.String, hostName: winrtDashUwpLib.WindowsNs.NetworkingNs.HostName, port: scala.Double) = this()
  /** Gets or sets the DNS-SD service instance name for this DnssdServiceInstance . */
  var dnssdServiceInstanceName: java.lang.String = js.native
  /** Gets or sets the hostname of the host for this DnssdServiceInstance . */
  var hostName: winrtDashUwpLib.WindowsNs.NetworkingNs.HostName = js.native
  /** Gets or sets the port number used by this DnssdServiceInstance . */
  var port: scala.Double = js.native
  /** Gets or sets the priority value to assign to this service instance, as defined in RFC 2782. Clients use Priority to decide which of several equivalent service instances to attach to. */
  var priority: scala.Double = js.native
  /** Gets the attributes of this service instance, as a list of [name, value] pairs of strings. Attributes can be inspected by service clients to determine additional information about a service instance. */
  var textAttributes: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMap[java.lang.String, java.lang.String] = js.native
  /** Gets or sets the weight value assigned to this service instance, as defined in RFC 2782. Clients use the Weight value to choose between servers with the same Priority value. */
  var weight: scala.Double = js.native
  /**
    * Asynchronously registers a datagram (UDP) socket listener for the service, on a given socket.
    * @param socket Describes the socket that this service instance uses to listen for new service clients.
    * @return On successful completion of the asynchronous operation, returns an object describing the results of registration.
    */
  def registerDatagramSocketAsync(socket: winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.DatagramSocket): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[DnssdRegistrationResult] = js.native
  /**
    * Asynchronously registers a datagram (UDP) socket listener for the service, on a given socket and network adapter.
    * @param socket Describes the socket that this service instance uses to listen for new service clients.
    * @param adapter Specifies the network adapter this service uses to listen for new service clients.
    * @return On successful completion of the asynchronous operation, returns an object describing the results of registration.
    */
  def registerDatagramSocketAsync(
    socket: winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.DatagramSocket,
    adapter: winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAdapter
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[DnssdRegistrationResult] = js.native
  /**
    * Asynchronously registers a stream (TCP) socket listener for the service, on the given socket.
    * @param socket Describes the socket that this service instance uses to listen for new service clients.
    * @return On successful completion of the asynchronous operation, returns an object describing the results of registration.
    */
  def registerStreamSocketListenerAsync(socket: winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.StreamSocketListener): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[DnssdRegistrationResult] = js.native
  /**
    * Asynchronously registers a stream (TCP) socket listener for the service, on the given socket and network adapter.
    * @param socket Describes the socket that this service instance uses to listen for new service clients.
    * @param adapter Specifies the network adapter this service uses to listen for new service clients.
    * @return On successful completion of the asynchronous operation, returns an object describing the results of registration.
    */
  def registerStreamSocketListenerAsync(
    socket: winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.StreamSocketListener,
    adapter: winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAdapter
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[DnssdRegistrationResult] = js.native
}

