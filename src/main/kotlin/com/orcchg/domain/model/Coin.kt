package com.orcchg.domain.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Serializable
sealed class Coin(
    @SerialName("index") val index: Long,
    @SerialName("name") val name: String,
    @SerialName("symbol") val symbol: String,
    @SerialName("url") val url: String,
    @SerialName("logoUrl") val logoUrl: String
) {
    override fun toString(): String = Json.encodeToString(this)

    @Serializable
    class Bitcoin : Coin(
        index = 0L,
        name = "Bitcoin",
        symbol = "BTC",
        url = "https://bitcoin.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/bitcoin/info/logo.png"
    )

    @Serializable
    class Litecoin : Coin(
        index = 2L,
        name = "Litecoin",
        symbol = "LTC",
        url = "https://litecoin.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/litecoin/info/logo.png"
    )

    @Serializable
    class Dogecoin : Coin(
        index = 3L,
        name = "Dogecoin",
        symbol = "DOGE",
        url = "https://dogecoin.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/doge/info/logo.png"
    )

    @Serializable
    class Dash : Coin(
        index = 5L,
        name = "Dash",
        symbol = "DASH",
        url = "https://dash.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/dash/info/logo.png"
    )

    @Serializable
    class Viacoin : Coin(
        index = 14L,
        name = "Viacoin",
        symbol = "VIA",
        url = "https://viacoin.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/viacoin/info/logo.png"
    )

    @Serializable
    class Groestlcoin : Coin(
        index = 17L,
        name = "Groestlcoin",
        symbol = "GRS",
        url = "https://www.groestlcoin.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/groestlcoin/info/logo.png"
    )

    @Serializable
    class DigiByte : Coin(
        index = 20L,
        name = "DigiByte",
        symbol = "DGB",
        url = "https://www.digibyte.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/digibyte/info/logo.png"
    )

    @Serializable
    class Monacoin : Coin(
        index = 22L,
        name = "Monacoin",
        symbol = "MONA",
        url = "https://monacoin.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/monacoin/info/logo.png"
    )

    @Serializable
    class Decred : Coin(
        index = 42L,
        name = "Decred",
        symbol = "DCR",
        url = "https://decred.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/decred/info/logo.png"
    )

    @Serializable
    class Syscoin : Coin(
        index = 57L,
        name = "Syscoin",
        symbol = "SYS",
        url = "https://syscoin.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/syscoin/info/logo.png"
    )

    @Serializable
    class Ethereum : Coin(
        index = 60L,
        name = "Ethereum",
        symbol = "ETH",
        url = "https://ethereum.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/ethereum/info/logo.png"
    )

    @Serializable
    class EthereumClassic : Coin(
        index = 61L,
        name = "Ethereum Classic",
        symbol = "ETC",
        url = "https://ethereumclassic.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/classic/info/logo.png"
    )

    @Serializable
    class Icon : Coin(
        index = 74L,
        name = "ICON",
        symbol = "ICX",
        url = "https://icon.foundation",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/icon/info/logo.png"
    )

    @Serializable
    class Verge : Coin(
        index = 77L,
        name = "Verge",
        symbol = "XVG",
        url = "https://vergecurrency.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/verge/info/logo.png"
    )

    @Serializable
    class CosmosHub : Coin(
        index = 118L,
        name = "Cosmos Hub",
        symbol = "ATOM",
        url = "https://cosmos.network",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/cosmos/info/logo.png"
    )

    @Serializable
    class Pivx : Coin(
        index = 119L,
        name = "Pivx",
        symbol = "PIVX",
        url = "https://pivx.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/pivx/info/logo.png"
    )

    @Serializable
    class Zen : Coin(
        index = 121L,
        name = "Zen",
        symbol = "ZEN",
        url = "https://www.horizen.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/zen/info/logo.png"
    )

    @Serializable
    class Zcash : Coin(
        index = 133L,
        name = "Zcash",
        symbol = "ZEC",
        url = "https://z.cash",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/zcash/info/logo.png"
    )

    @Serializable
    class Firo : Coin(
        index = 136L,
        name = "Firo",
        symbol = "FIRO",
        url = "https://firo.org/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/firo/info/logo.png"
    )

    @Serializable
    class Rootstock : Coin(
        index = 137L,
        name = "Rootstock",
        symbol = "RBTC",
        url = "https://rootstock.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/rootstock/info/logo.png"
    )

    @Serializable
    class Komodo : Coin(
        index = 141L,
        name = "Komodo",
        symbol = "KMD",
        url = "https://komodoplatform.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/komodo/info/logo.png"
    )

    @Serializable
    class Ripple : Coin(
        index = 144L,
        name = "Ripple",
        symbol = "XRP",
        url = "https://ripple.com/xrp",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/ripple/info/logo.png"
    )

    @Serializable
    class BitcoinCash : Coin(
        index = 145L,
        name = "Bitcoin Cash",
        symbol = "BCH",
        url = "https://bitcoincash.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/bitcoincash/info/logo.png"
    )

    @Serializable
    class Nebl : Coin(
        index = 146L,
        name = "Nebl",
        symbol = "NEBL",
        url = "https://nebl.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/Nebl/info/logo.png"
    )

    @Serializable
    class Stellar : Coin(
        index = 148L,
        name = "Stellar",
        symbol = "XLM",
        url = "https://stellar.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/stellar/info/logo.png"
    )

    @Serializable
    class BitcoinGold : Coin(
        index = 156L,
        name = "Bitcoin Gold",
        symbol = "BTG",
        url = "https://bitcoingold.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/bitcoingold/info/logo.png"
    )

    @Serializable
    class Nano : Coin(
        index = 165L,
        name = "Nano",
        symbol = "XNO",
        url = "https://nano.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/nano/info/logo.png"
    )

    @Serializable
    class MantaPacific : Coin(
        index = 169L,
        name = "Manta Pacific",
        symbol = "ETH",
        url = "https://pacific.manta.network",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/manta/info/logo.png"
    )

    @Serializable
    class Ravencoin : Coin(
        index = 175L,
        name = "Ravencoin",
        symbol = "RVN",
        url = "https://ravencoin.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/ravencoin/info/logo.png"
    )

    @Serializable
    class PoaNetwork : Coin(
        index = 178L,
        name = "POA Network",
        symbol = "POA",
        url = "https://poa.network",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/poa/info/logo.png"
    )

    @Serializable
    class Eos : Coin(
        index = 194L,
        name = "Eos",
        symbol = "EOS",
        url = "http://eos.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/eos/info/logo.png"
    )

    @Serializable
    class Tron : Coin(
        index = 195L,
        name = "Tron",
        symbol = "TRX",
        url = "https://tron.network",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/tron/info/logo.png"
    )

    @Serializable
    class OpBNB : Coin(
        index = 204L,
        name = "OpBNB",
        symbol = "BNB",
        url = "https://opbnb.bnbchain.org/en",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/opbnb/info/logo.png"
    )

    @Serializable
    class InternetComputer : Coin(
        index = 223L,
        name = "Internet Computer",
        symbol = "ICP",
        url = "https://internetcomputer.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/internet_computer/info/logo.png"
    )

    @Serializable
    class Fio : Coin(
        index = 235L,
        name = "Fio",
        symbol = "FIO",
        url = "https://fioprotocol.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/fio/info/logo.png"
    )

    @Serializable
    class Nimiq : Coin(
        index = 242L,
        name = "Nimiq",
        symbol = "NIM",
        url = "https://nimiq.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/nimiq/info/logo.png"
    )

    @Serializable
    class Algorand : Coin(
        index = 283L,
        name = "Algorand",
        symbol = "ALGO",
        url = "https://www.algorand.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/algorand/info/logo.png"
    )

    @Serializable
    class Iost : Coin(
        index = 291L,
        name = "Iost",
        symbol = "IOST",
        url = "https://iost.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/iost/info/logo.png"
    )

    @Serializable
    class IoTeX : Coin(
        index = 304L,
        name = "IoTeX",
        symbol = "IOTX",
        url = "https://iotex.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/iotex/info/logo.png"
    )

    @Serializable
    class Nervos : Coin(
        index = 309L,
        name = "Nervos",
        symbol = "CKB",
        url = "https://nervos.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/nervos/info/logo.png"
    )

    @Serializable
    class Zilliqa : Coin(
        index = 313L,
        name = "Zilliqa",
        symbol = "ZIL",
        url = "https://zilliqa.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/zilliqa/info/logo.png"
    )

    @Serializable
    class TerraClassic : Coin(
        index = 330L,
        name = "Terra Classic",
        symbol = "LUNC",
        url = "https://terra.money",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/terra/info/logo.png"
    )

    @Serializable
    class Polkadot : Coin(
        index = 354L,
        name = "Polkadot",
        symbol = "DOT",
        url = "https://polkadot.network/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/polkadot/info/logo.png"
    )

    @Serializable
    class ThetaFuel : Coin(
        index = 361L,
        name = "Theta Fuel",
        symbol = "TFUEL",
        url = "https://www.thetatoken.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/tfuelevm/info/logo.png"
    )

    @Serializable
    class CryptoOrg : Coin(
        index = 394L,
        name = "Crypto.org",
        symbol = "CRO",
        url = "https://crypto.org/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/cryptoorg/info/logo.png"
    )

    @Serializable
    class Everscale : Coin(
        index = 396L,
        name = "Everscale",
        symbol = "EVER",
        url = "https://everscale.network/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/everscale/info/logo.png"
    )

    @Serializable
    class Near : Coin(
        index = 397L,
        name = "Near",
        symbol = "NEAR",
        url = "https://nearprotocol.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/near/info/logo.png"
    )

    @Serializable
    class Aion : Coin(
        index = 425L,
        name = "Aion",
        symbol = "AION",
        url = "https://aion.network",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/aion/info/logo.png"
    )

    @Serializable
    class Kusama : Coin(
        index = 434L,
        name = "Kusama",
        symbol = "KSM",
        url = "https://kusama.network",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/kusama/info/logo.png"
    )

    @Serializable
    class Aeternity : Coin(
        index = 457L,
        name = "Aeternity",
        symbol = "AE",
        url = "https://aeternity.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/aeternity/info/logo.png"
    )

    @Serializable
    class Kava : Coin(
        index = 459L,
        name = "Kava",
        symbol = "KAVA",
        url = "https://kava.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/kava/info/logo.png"
    )

    @Serializable
    class Filecoin : Coin(
        index = 461L,
        name = "Filecoin",
        symbol = "FIL",
        url = "https://filecoin.io/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/filecoin/info/logo.png"
    )

    @Serializable
    class Oasis : Coin(
        index = 474L,
        name = "Oasis",
        symbol = "ROSE",
        url = "https://oasisprotocol.org/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/oasis/info/logo.png"
    )

    @Serializable
    class Bluzelle : Coin(
        index = 483L,
        name = "Bluzelle",
        symbol = "BLZ",
        url = "https://bluzelle.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/bluzelle/info/logo.png"
    )

    @Serializable
    class BandChain : Coin(
        index = 494L,
        name = "BandChain",
        symbol = "BAND",
        url = "https://bandprotocol.com/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/band/info/logo.png"
    )

    @Serializable
    class Theta : Coin(
        index = 500L,
        name = "Theta",
        symbol = "THETA",
        url = "https://www.thetatoken.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/theta/info/logo.png"
    )

    @Serializable
    class Solana : Coin(
        index = 501L,
        name = "Solana",
        symbol = "SOL",
        url = "https://solana.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/solana/info/logo.png"
    )

    @Serializable
    class MultiversX : Coin(
        index = 508L,
        name = "MultiversX",
        symbol = "eGLD",
        url = "https://multiversx.com/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/elrond/info/logo.png"
    )

    @Serializable
    class Secret : Coin(
        index = 529L,
        name = "Secret",
        symbol = "SCRT",
        url = "https://scrt.network/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/secret/info/logo.png"
    )

    @Serializable
    class Agoric : Coin(
        index = 564L,
        name = "Agoric",
        symbol = "BLD",
        url = "https://agoric.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/agoric/info/logo.png"
    )

    @Serializable
    class Ton : Coin(
        index = 607L,
        name = "Ton",
        symbol = "TON",
        url = "https://ton.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/ton/info/logo.png"
    )

    @Serializable
    class Aptos : Coin(
        index = 637L,
        name = "Aptos",
        symbol = "APT",
        url = "https://aptoslabs.com/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/aptos/info/logo.png"
    )

    @Serializable
    class BNBBeaconChain : Coin(
        index = 714L,
        name = "BNB Beacon Chain",
        symbol = "BNB",
        url = "https://www.bnbchain.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/binance/info/logo.png"
    )

    @Serializable
    class Sui : Coin(
        index = 784L,
        name = "Sui",
        symbol = "SUI",
        url = "https://sui.io/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/sui/info/logo.png"
    )

    @Serializable
    class Acala : Coin(
        index = 787L,
        name = "Acala",
        symbol = "ACA",
        url = "https://acala.network",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/acala/info/logo.png"
    )

    @Serializable
    class VeChain : Coin(
        index = 818L,
        name = "VeChain",
        symbol = "VET",
        url = "https://vechain.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/vechain/info/logo.png"
    )

    @Serializable
    class Callisto : Coin(
        index = 820L,
        name = "Callisto",
        symbol = "CLO",
        url = "https://callisto.network",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/callisto/info/logo.png"
    )

    @Serializable
    class Neo : Coin(
        index = 888L,
        name = "Neo",
        symbol = "NEO",
        url = "https://neo.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/neo/info/logo.png"
    )

    @Serializable
    class Viction : Coin(
        index = 889L,
        name = "Viction",
        symbol = "VIC",
        url = "https://www.viction.xyz/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/viction/info/logo.png"
    )

    @Serializable
    class ECash : Coin(
        index = 899L,
        name = "eCash",
        symbol = "XEC",
        url = "https://e.cash",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/ecash/info/logo.png"
    )

    @Serializable
    class THORChain : Coin(
        index = 931L,
        name = "THORChain",
        symbol = "RUNE",
        url = "https://thorchain.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/thorchain/info/logo.png"
    )

    @Serializable
    class Polygon : Coin(
        index = 966L,
        name = "Polygon",
        symbol = "MATIC",
        url = "https://polygon.technology",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/polygon/info/logo.png"
    )

    @Serializable
    class OKXChain : Coin(
        index = 996L,
        name = "OKX Chain",
        symbol = "OKT",
        url = "https://www.okx.com/okc",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/okc/info/logo.png"
    )

    @Serializable
    class BitcoinDiamond : Coin(
        index = 999L,
        name = "Bitcoin Diamond",
        symbol = "BCD",
        url = "https://www.bitcoindiamond.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/bitcoindiamond/info/logo.png"
    )

    @Serializable
    class ThunderCore : Coin(
        index = 1001L,
        name = "ThunderCore",
        symbol = "TT",
        url = "https://thundercore.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/thundertoken/info/logo.png"
    )

    @Serializable
    class Harmony : Coin(
        index = 1023L,
        name = "Harmony",
        symbol = "ONE",
        url = "https://harmony.one",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/harmony/info/logo.png"
    )

    @Serializable
    class Ontology : Coin(
        index = 1024L,
        name = "Ontology",
        symbol = "ONT",
        url = "https://ont.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/ontology/info/logo.png"
    )

    @Serializable
    class ConfluxESpace : Coin(
        index = 1030L,
        name = "Conflux eSpace",
        symbol = "CFX",
        url = "https://confluxnetwork.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/cfxevm/info/logo.png"
    )

    @Serializable
    class Tezos : Coin(
        index = 1729L,
        name = "Tezos",
        symbol = "XTZ",
        url = "https://tezos.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/tezos/info/logo.png"
    )

    @Serializable
    class Cardano : Coin(
        index = 1815L,
        name = "Cardano",
        symbol = "ADA",
        url = "https://www.cardano.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/cardano/info/logo.png"
    )

    @Serializable
    class LightlinkPhoenix : Coin(
        index = 1890L,
        name = "Lightlink Phoenix",
        symbol = "LL",
        url = "https://lightlink.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/lightlink/info/logo.png"
    )

    @Serializable
    class Qtum : Coin(
        index = 2301L,
        name = "Qtum",
        symbol = "QTUM",
        url = "https://qtum.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/qtum/info/logo.png"
    )

    @Serializable
    class Nebulas : Coin(
        index = 2718L,
        name = "Nebulas",
        symbol = "NAS",
        url = "https://nebulas.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/nebulas/info/logo.png"
    )

    @Serializable
    class Hedera : Coin(
        index = 3030L,
        name = "Hedera",
        symbol = "HBAR",
        url = "https://hedera.com/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/hedera/info/logo.png"
    )

    @Serializable
    class Merlin : Coin(
        index = 4200L,
        name = "Merlin",
        symbol = "MERL",
        url = "https://merlinchain.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/merlin/info/logo.png"
    )

    @Serializable
    class Mantle : Coin(
        index = 5000L,
        name = "Mantle",
        symbol = "MNT",
        url = "https://www.mantle.xyz",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/mantle/info/logo.png"
    )

    @Serializable
    class BNBGreenfield : Coin(
        index = 5600L,
        name = "BNB Greenfield",
        symbol = "BNB",
        url = "https://greenfield.bnbchain.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/greenfield/info/logo.png"
    )

    @Serializable
    class BounceBit : Coin(
        index = 6001L,
        name = "BounceBit",
        symbol = "BB",
        url = "https://bouncebit.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/bouncebit/info/logo.png"
    )

    @Serializable
    class GoChain : Coin(
        index = 6060L,
        name = "GoChain",
        symbol = "GO",
        url = "https://gochain.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/gochain/info/logo.png"
    )

    @Serializable
    class ZenEon : Coin(
        index = 7332L,
        name = "Zen EON",
        symbol = "ZEN",
        url = "https://eon.horizen.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/zeneon/info/logo.png"
    )

    @Serializable
    class Base : Coin(
        index = 8453L,
        name = "Base",
        symbol = "ETH",
        url = "https://base.mirror.xyz/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/base/info/logo.png"
    )

    @Serializable
    class Nuls : Coin(
        index = 8964L,
        name = "Nuls",
        symbol = "NULS",
        url = "https://nuls.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/nuls/info/logo.png"
    )

    @Serializable
    class Wax : Coin(
        index = 14001L,
        name = "Wax",
        symbol = "WAXP",
        url = "http://wax.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/wax/info/logo.png"
    )

    @Serializable
    class Meter : Coin(
        index = 18000L,
        name = "Meter",
        symbol = "MTR",
        url = "https://meter.io/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/meter/info/logo.png"
    )

    @Serializable
    class Flux : Coin(
        index = 19167L,
        name = "Flux",
        symbol = "FLUX",
        url = "https://runonflux.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/zelcash/info/logo.png"
    )

    @Serializable
    class Celo : Coin(
        index = 52752L,
        name = "Celo",
        symbol = "CELO",
        url = "https://celo.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/celo/info/logo.png"
    )

    @Serializable
    class Linea : Coin(
        index = 59144L,
        name = "Linea",
        symbol = "ETH",
        url = "https://linea.build",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/linea/info/logo.png"
    )

    @Serializable
    class Stratis : Coin(
        index = 105105L,
        name = "Stratis",
        symbol = "STRAX",
        url = "https://www.stratisplatform.com/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/stratis/info/logo.png"
    )

    @Serializable
    class Scroll : Coin(
        index = 534352L,
        name = "Scroll",
        symbol = "ETH",
        url = "https://scroll.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/scroll/info/logo.png"
    )

    @Serializable
    class ZkLinkNovaMainnet : Coin(
        index = 810180L,
        name = "zkLink Nova Mainnet",
        symbol = "ETH",
        url = "https://zklink.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/zklinknova/info/logo.png"
    )

    @Serializable
    class Wanchain : Coin(
        index = 5718350L,
        name = "Wanchain",
        symbol = "WAN",
        url = "https://wanchain.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/wanchain/info/logo.png"
    )

    @Serializable
    class Waves : Coin(
        index = 5741564L,
        name = "Waves",
        symbol = "WAVES",
        url = "https://wavesplatform.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/waves/info/logo.png"
    )

    @Serializable
    class CronosChain : Coin(
        index = 10000025L,
        name = "Cronos Chain",
        symbol = "CRO",
        url = "https://cronos.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/cronos/info/logo.png"
    )

    @Serializable
    class NativeInjective : Coin(
        index = 10000060L,
        name = "Native Injective",
        symbol = "INJ",
        url = "https://injective.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/nativeinjective/info/logo.png"
    )

    @Serializable
    class OPMainnet : Coin(
        index = 10000070L,
        name = "OP Mainnet",
        symbol = "ETH",
        url = "https://optimism.io/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/optimism/info/logo.png"
    )

    @Serializable
    class GnosisChain : Coin(
        index = 10000100L,
        name = "Gnosis Chain",
        symbol = "xDAI",
        url = "https://www.xdaichain.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/xdai/info/logo.png"
    )

    @Serializable
    class Osmosis : Coin(
        index = 10000118L,
        name = "Osmosis",
        symbol = "OSMO",
        url = "https://osmosis.zone/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/osmosis/info/logo.png"
    )

    @Serializable
    class SmartBitcoinCash : Coin(
        index = 10000145L,
        name = "Smart Bitcoin Cash",
        symbol = "BCH",
        url = "https://smartbch.org/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/smartbch/info/logo.png"
    )

    @Serializable
    class Fantom : Coin(
        index = 10000250L,
        name = "Fantom",
        symbol = "FTM",
        url = "https://fantom.foundation",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/fantom/info/logo.png"
    )

    @Serializable
    class Boba : Coin(
        index = 10000288L,
        name = "Boba",
        symbol = "BOBAETH",
        url = "https://boba.network/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/boba/info/logo.png"
    )

    @Serializable
    class KuCoinCommunityChain : Coin(
        index = 10000321L,
        name = "KuCoin Community Chain",
        symbol = "KCS",
        url = "https://www.kcc.io/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/kcc/info/logo.png"
    )

    @Serializable
    class ZkSyncEra : Coin(
        index = 10000324L,
        name = "zkSync Era",
        symbol = "ETH",
        url = "https://portal.zksync.io/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/zksync/info/logo.png"
    )

    @Serializable
    class Terra : Coin(
        index = 10000330L,
        name = "Terra",
        symbol = "LUNA",
        url = "https://terra.money",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/terrav2/info/logo.png"
    )

    @Serializable
    class HuobiECOChain : Coin(
        index = 10000553L,
        name = "Huobi ECO Chain",
        symbol = "HT",
        url = "https://www.hecochain.com/en-us",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/heco/info/logo.png"
    )

    @Serializable
    class AcalaEVM : Coin(
        index = 10000787L,
        name = "Acala EVM",
        symbol = "ACA",
        url = "https://acala.network",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/acalaevm/info/logo.png"
    )

    @Serializable
    class Coreum : Coin(
        index = 10000990L,
        name = "Coreum",
        symbol = "CORE",
        url = "https://www.coreum.com/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/coreum/info/logo.png"
    )

    @Serializable
    class Metis : Coin(
        index = 10001088L,
        name = "Metis",
        symbol = "METIS",
        url = "https://www.metis.io/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/metis/info/logo.png"
    )

    @Serializable
    class PolygonZkEVM : Coin(
        index = 10001101L,
        name = "Polygon zkEVM",
        symbol = "ETH",
        url = "https://www.polygon.technology/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/polygonzkevm/info/logo.png"
    )

    @Serializable
    class Moonbeam : Coin(
        index = 10001284L,
        name = "Moonbeam",
        symbol = "GLMR",
        url = "https://moonbeam.network",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/moonbeam/info/logo.png"
    )

    @Serializable
    class Moonriver : Coin(
        index = 10001285L,
        name = "Moonriver",
        symbol = "MOVR",
        url = "https://moonbeam.network/networks/moonriver",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/moonriver/info/logo.png"
    )

    @Serializable
    class Ronin : Coin(
        index = 10002020L,
        name = "Ronin",
        symbol = "RON",
        url = "https://whitepaper.axieinfinity.com/technology/ronin-ethereum-sidechain",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/ronin/info/logo.png"
    )

    @Serializable
    class KavaEvm : Coin(
        index = 10002222L,
        name = "KavaEvm",
        symbol = "KAVA",
        url = "https://www.kava.io/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/kavaevm/info/logo.png"
    )

    @Serializable
    class IoTeXEVM : Coin(
        index = 10004689L,
        name = "IoTeX EVM",
        symbol = "IOTX",
        url = "https://iotex.io/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/iotexevm/info/logo.png"
    )

    @Serializable
    class NativeZetaChain : Coin(
        index = 10007000L,
        name = "NativeZetaChain",
        symbol = "ZETA",
        url = "https://www.zetachain.com/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/zetachain/info/logo.png"
    )

    @Serializable
    class NativeCanto : Coin(
        index = 10007700L,
        name = "NativeCanto",
        symbol = "CANTO",
        url = "https://canto.io/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/nativecanto/info/logo.png"
    )

    @Serializable
    class Klaytn : Coin(
        index = 10008217L,
        name = "Klaytn",
        symbol = "KLAY",
        url = "https://klaytn.foundation",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/klaytn/info/logo.png"
    )

    @Serializable
    class AvalancheCChain : Coin(
        index = 10009000L,
        name = "Avalanche C-Chain",
        symbol = "AVAX",
        url = "https://www.avalabs.org/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/avalanchec/info/logo.png"
    )

    @Serializable
    class Evmos : Coin(
        index = 10009001L,
        name = "Evmos",
        symbol = "EVMOS",
        url = "https://evmos.org/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/evmos/info/logo.png"
    )

    @Serializable
    class ArbitrumNova : Coin(
        index = 10042170L,
        name = "Arbitrum Nova",
        symbol = "ETH",
        url = "https://nova.arbitrum.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/arbitrumnova/info/logo.png"
    )

    @Serializable
    class Arbitrum : Coin(
        index = 10042221L,
        name = "Arbitrum",
        symbol = "ETH",
        url = "https://arbitrum.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/arbitrum/info/logo.png"
    )

    @Serializable
    class Sommelier : Coin(
        index = 11000118L,
        name = "Sommelier",
        symbol = "SOMM",
        url = "https://www.sommelier.finance/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/sommelier/info/logo.png"
    )

    @Serializable
    class FetchAI : Coin(
        index = 12000118L,
        name = "Fetch AI",
        symbol = "FET",
        url = "https://fetch.ai/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/fetchai/info/logo.png"
    )

    @Serializable
    class MarsHub : Coin(
        index = 13000118L,
        name = "Mars Hub",
        symbol = "MARS",
        url = "https://marsprotocol.io/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/mars/info/logo.png"
    )

    @Serializable
    class Umee : Coin(
        index = 14000118L,
        name = "Umee",
        symbol = "UMEE",
        url = "https://umee.cc/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/umee/info/logo.png"
    )

    @Serializable
    class Quasar : Coin(
        index = 15000118L,
        name = "Quasar",
        symbol = "QSR",
        url = "https://www.quasar.fi/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/quasar/info/logo.png"
    )

    @Serializable
    class Persistence : Coin(
        index = 16000118L,
        name = "Persistence",
        symbol = "XPRT",
        url = "https://persistence.one/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/persistence/info/logo.png"
    )

    @Serializable
    class Akash : Coin(
        index = 17000118L,
        name = "Akash",
        symbol = "AKT",
        url = "https://akash.network/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/akash/info/logo.png"
    )

    @Serializable
    class Noble : Coin(
        index = 18000118L,
        name = "Noble",
        symbol = "USDC",
        url = "https://nobleassets.xyz/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/noble/info/logo.png"
    )

    @Serializable
    class Sei : Coin(
        index = 19000118L,
        name = "Sei",
        symbol = "SEI",
        url = "https://sei.io/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/sei/info/logo.png"
    )

    @Serializable
    class Stargaze : Coin(
        index = 20000118L,
        name = "Stargaze",
        symbol = "STARS",
        url = "https://www.stargaze.zone/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/stargaze/info/logo.png"
    )

    @Serializable
    class BNBSmartChain : Coin(
        index = 20000714L,
        name = "BNB Smart Chain",
        symbol = "BNB",
        url = "https://www.binance.org/en/smartChain",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/smartchain/info/logo.png"
    )

    @Serializable
    class ZetaEVM : Coin(
        index = 20007000L,
        name = "Zeta EVM",
        symbol = "ZETA",
        url = "https://www.zetachain.com/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/zetaevm/info/logo.png"
    )

    @Serializable
    class NativeEvmos : Coin(
        index = 20009001L,
        name = "Native Evmos",
        symbol = "EVMOS",
        url = "https://evmos.org/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/nativeevmos/info/logo.png"
    )

    @Serializable
    class Celestia : Coin(
        index = 21000118L,
        name = "Celestia",
        symbol = "TIA",
        url = "https://celestia.org/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/tia/info/logo.png"
    )

    @Serializable
    class DYdX : Coin(
        index = 22000118L,
        name = "dYdX",
        symbol = "DYDX",
        url = "https://dydx.exchange",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/dydx/info/logo.png"
    )

    @Serializable
    class Juno : Coin(
        index = 30000118L,
        name = "Juno",
        symbol = "JUNO",
        url = "https://www.junonetwork.io/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/juno/info/logo.png"
    )

    @Serializable
    class Tbnb : Coin(
        index = 30000714L,
        name = "TBNB",
        symbol = "BNB",
        url = "https://www.bnbchain.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/tbinance/info/logo.png"
    )

    @Serializable
    class Stride : Coin(
        index = 40000118L,
        name = "Stride",
        symbol = "STRD",
        url = "https://stride.zone/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/stride/info/logo.png"
    )

    @Serializable
    class Axelar : Coin(
        index = 50000118L,
        name = "Axelar",
        symbol = "AXL",
        url = "https://axelar.network/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/axelar/info/logo.png"
    )

    @Serializable
    class Crescent : Coin(
        index = 60000118L,
        name = "Crescent",
        symbol = "CRE",
        url = "https://crescent.network/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/crescent/info/logo.png"
    )

    @Serializable
    class Kujira : Coin(
        index = 70000118L,
        name = "Kujira",
        symbol = "KUJI",
        url = "https://kujira.app/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/kujira/info/logo.png"
    )

    @Serializable
    class Comdex : Coin(
        index = 80000118L,
        name = "Comdex",
        symbol = "CMDX",
        url = "https://comdex.one/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/comdex/info/logo.png"
    )

    @Serializable
    class Neutron : Coin(
        index = 90000118L,
        name = "Neutron",
        symbol = "NTRN",
        url = "https://neutron.org/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/neutron/info/logo.png"
    )

    @Serializable
    class Neon : Coin(
        index = 245022934L,
        name = "Neon",
        symbol = "NEON",
        url = "https://neonevm.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/neon/info/logo.png"
    )

    @Serializable
    class Aurora : Coin(
        index = 1323161554L,
        name = "Aurora",
        symbol = "ETH",
        url = "https://aurora.dev/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/aurora/info/logo.png"
    )
}
