package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MySqlReplicaConfiguration extends js.Object {
  /** PEM representation of the trusted CA's x509 certificate. */
  var caCertificate: js.UndefOr[java.lang.String] = js.undefined
  /** PEM representation of the slave's x509 certificate. */
  var clientCertificate: js.UndefOr[java.lang.String] = js.undefined
  /** PEM representation of the slave's private key. The corresponsing public key is encoded in the client's certificate. */
  var clientKey: js.UndefOr[java.lang.String] = js.undefined
  /** Seconds to wait between connect retries. MySQL's default is 60 seconds. */
  var connectRetryInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * Path to a SQL dump file in Google Cloud Storage from which the slave instance is to be created. The URI is in the form gs://bucketName/fileName.
    * Compressed gzip files (.gz) are also supported. Dumps should have the binlog co-ordinates from which replication should begin. This can be accomplished
    * by setting --master-data to 1 when using mysqldump.
    */
  var dumpFilePath: js.UndefOr[java.lang.String] = js.undefined
  /** This is always sql#mysqlReplicaConfiguration. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Interval in milliseconds between replication heartbeats. */
  var masterHeartbeatPeriod: js.UndefOr[java.lang.String] = js.undefined
  /** The password for the replication connection. */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /** A list of permissible ciphers to use for SSL encryption. */
  var sslCipher: js.UndefOr[java.lang.String] = js.undefined
  /** The username for the replication connection. */
  var username: js.UndefOr[java.lang.String] = js.undefined
  /** Whether or not to check the master's Common Name value in the certificate that it sends during the SSL handshake. */
  var verifyServerCertificate: js.UndefOr[scala.Boolean] = js.undefined
}

object MySqlReplicaConfiguration {
  @scala.inline
  def apply(
    caCertificate: java.lang.String = null,
    clientCertificate: java.lang.String = null,
    clientKey: java.lang.String = null,
    connectRetryInterval: scala.Int | scala.Double = null,
    dumpFilePath: java.lang.String = null,
    kind: java.lang.String = null,
    masterHeartbeatPeriod: java.lang.String = null,
    password: java.lang.String = null,
    sslCipher: java.lang.String = null,
    username: java.lang.String = null,
    verifyServerCertificate: js.UndefOr[scala.Boolean] = js.undefined
  ): MySqlReplicaConfiguration = {
    val __obj = js.Dynamic.literal()
    if (caCertificate != null) __obj.updateDynamic("caCertificate")(caCertificate)
    if (clientCertificate != null) __obj.updateDynamic("clientCertificate")(clientCertificate)
    if (clientKey != null) __obj.updateDynamic("clientKey")(clientKey)
    if (connectRetryInterval != null) __obj.updateDynamic("connectRetryInterval")(connectRetryInterval.asInstanceOf[js.Any])
    if (dumpFilePath != null) __obj.updateDynamic("dumpFilePath")(dumpFilePath)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (masterHeartbeatPeriod != null) __obj.updateDynamic("masterHeartbeatPeriod")(masterHeartbeatPeriod)
    if (password != null) __obj.updateDynamic("password")(password)
    if (sslCipher != null) __obj.updateDynamic("sslCipher")(sslCipher)
    if (username != null) __obj.updateDynamic("username")(username)
    if (!js.isUndefined(verifyServerCertificate)) __obj.updateDynamic("verifyServerCertificate")(verifyServerCertificate)
    __obj.asInstanceOf[MySqlReplicaConfiguration]
  }
}

