package network.xyo.sdkcorekotlin.node

import network.xyo.sdkcorekotlin.XyoTestBase
import org.junit.Assert
import org.junit.Test

class XyoBridgeQueueTest : XyoTestBase() {

//    @Test
//    fun testQueueWhenRemoveWeightIsSmallerThanSendSize () {
//        val queue = XyoBridgeQueue()
//        val numberOfBlocks = 1000
//        queue.removeWeight = 3
//        queue.sendLimit = 10
//
//        for (i in 0 until numberOfBlocks) {
//            queue.addBlock(byteArrayOf(i.toByte()))
//        }
//
//        var numberOfBlocksOffloaded = 0
//        var payloadsSent = 0
//
//        while (queue.getAllBlocks().isNotEmpty()) {
//
//            val blocksToBridge = queue.getBlocksToBridge()
//            payloadsSent++
//            numberOfBlocksOffloaded += blocksToBridge.blocks.size
//            blocksToBridge.onSucceed()
//        }
//
//        Assert.assertEquals(queue.removeWeight * numberOfBlocks, numberOfBlocksOffloaded)
//        Assert.assertEquals((numberOfBlocks / queue.sendLimit) * queue.removeWeight, payloadsSent)
//    }
}