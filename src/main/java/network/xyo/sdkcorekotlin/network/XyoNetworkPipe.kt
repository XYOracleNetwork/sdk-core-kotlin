package network.xyo.sdkcorekotlin.network

import kotlinx.coroutines.experimental.Deferred
import network.xyo.sdkcorekotlin.XyoError
import network.xyo.sdkcorekotlin.XyoResult

abstract class XyoNetworkPipe {
    abstract val peer : XyoNetworkPeer
    abstract val initiationData : ByteArray?
    abstract fun send (data : ByteArray) : Deferred<XyoResult<ByteArray>>
    abstract fun close() : Deferred<XyoError?>
}