package com.orcchg.domain.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class Coin(
    @SerialName("index") val index: Long,
    @SerialName("name") val name: String,
    @SerialName("symbol") val symbol: String,
    @SerialName("url") val url: String,
    @SerialName("logoUrl") val logoUrl: String
) {
    data object Bitcoin : Coin(
        index = 0L,
        name = "Bitcoin",
        symbol = "BTC",
        url = "https://bitcoin.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/bitcoin/info/logo.png"
    )

    data object Litecoin : Coin(
        index = 2L,
        name = "Litecoin",
        symbol = "LTC",
        url = "https://litecoin.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/litecoin/info/logo.png"
    )

    data object Dogecoin : Coin(
        index = 3L,
        name = "Dogecoin",
        symbol = "DOGE",
        url = "https://dogecoin.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/doge/info/logo.png"
    )

    data object Dash : Coin(
        index = 5L,
        name = "Dash",
        symbol = "DASH",
        url = "https://dash.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/dash/info/logo.png"
    )

    data object Viacoin : Coin(
        index = 14L,
        name = "Viacoin",
        symbol = "VIA",
        url = "https://viacoin.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/viacoin/info/logo.png"
    )

    data object Groestlcoin : Coin(
        index = 17L,
        name = "Groestlcoin",
        symbol = "GRS",
        url = "https://www.groestlcoin.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/groestlcoin/info/logo.png"
    )

    data object DigiByte : Coin(
        index = 20L,
        name = "DigiByte",
        symbol = "DGB",
        url = "https://www.digibyte.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/digibyte/info/logo.png"
    )

    data object Monacoin : Coin(
        index = 22L,
        name = "Monacoin",
        symbol = "MONA",
        url = "https://monacoin.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/monacoin/info/logo.png"
    )

    data object Decred : Coin(
        index = 42L,
        name = "Decred",
        symbol = "DCR",
        url = "https://decred.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/decred/info/logo.png"
    )

    data object Syscoin : Coin(
        index = 57L,
        name = "Syscoin",
        symbol = "SYS",
        url = "https://syscoin.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/syscoin/info/logo.png"
    )

    data object Ethereum : Coin(
        index = 60L,
        name = "Ethereum",
        symbol = "ETH",
        url = "https://ethereum.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/ethereum/info/logo.png"
    )

    data object EthereumClassic : Coin(
        index = 61L,
        name = "Ethereum Classic",
        symbol = "ETC",
        url = "https://ethereumclassic.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/classic/info/logo.png"
    )

    data object Icon : Coin(
        index = 74L,
        name = "ICON",
        symbol = "ICX",
        url = "https://icon.foundation",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/icon/info/logo.png"
    )

    data object Verge : Coin(
        index = 77L,
        name = "Verge",
        symbol = "XVG",
        url = "https://vergecurrency.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/verge/info/logo.png"
    )

    data object CosmosHub : Coin(
        index = 118L,
        name = "Cosmos Hub",
        symbol = "ATOM",
        url = "https://cosmos.network",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/cosmos/info/logo.png"
    )

    data object Pivx : Coin(
        index = 119L,
        name = "Pivx",
        symbol = "PIVX",
        url = "https://pivx.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/pivx/info/logo.png"
    )

    data object Zen : Coin(
        index = 121L,
        name = "Zen",
        symbol = "ZEN",
        url = "https://www.horizen.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/zen/info/logo.png"
    )

    data object Zcash : Coin(
        index = 133L,
        name = "Zcash",
        symbol = "ZEC",
        url = "https://z.cash",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/zcash/info/logo.png"
    )

    data object Firo : Coin(
        index = 136L,
        name = "Firo",
        symbol = "FIRO",
        url = "https://firo.org/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/firo/info/logo.png"
    )

    data object Rootstock : Coin(
        index = 137L,
        name = "Rootstock",
        symbol = "RBTC",
        url = "https://rootstock.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/rootstock/info/logo.png"
    )

    data object Komodo : Coin(
        index = 141L,
        name = "Komodo",
        symbol = "KMD",
        url = "https://komodoplatform.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/komodo/info/logo.png"
    )

    data object Ripple : Coin(
        index = 144L,
        name = "Ripple",
        symbol = "XRP",
        url = "https://ripple.com/xrp",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/ripple/info/logo.png"
    )

    data object BitcoinCash : Coin(
        index = 145L,
        name = "Bitcoin Cash",
        symbol = "BCH",
        url = "https://bitcoincash.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/bitcoincash/info/logo.png"
    )

    data object Nebl : Coin(
        index = 146L,
        name = "Nebl",
        symbol = "NEBL",
        url = "https://nebl.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/Nebl/info/logo.png"
    )

    data object Stellar : Coin(
        index = 148L,
        name = "Stellar",
        symbol = "XLM",
        url = "https://stellar.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/stellar/info/logo.png"
    )

    data object BitcoinGold : Coin(
        index = 156L,
        name = "Bitcoin Gold",
        symbol = "BTG",
        url = "https://bitcoingold.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/bitcoingold/info/logo.png"
    )

    data object Nano : Coin(
        index = 165L,
        name = "Nano",
        symbol = "XNO",
        url = "https://nano.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/nano/info/logo.png"
    )

    data object MantaPacific : Coin(
        index = 169L,
        name = "Manta Pacific",
        symbol = "ETH",
        url = "https://pacific.manta.network",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/manta/info/logo.png"
    )

    data object Ravencoin : Coin(
        index = 175L,
        name = "Ravencoin",
        symbol = "RVN",
        url = "https://ravencoin.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/ravencoin/info/logo.png"
    )

    data object PoaNetwork : Coin(
        index = 178L,
        name = "POA Network",
        symbol = "POA",
        url = "https://poa.network",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/poa/info/logo.png"
    )

    data object Eos : Coin(
        index = 194L,
        name = "Eos",
        symbol = "EOS",
        url = "http://eos.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/eos/info/logo.png"
    )

    data object Tron : Coin(
        index = 195L,
        name = "Tron",
        symbol = "TRX",
        url = "https://tron.network",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/tron/info/logo.png"
    )

    data object OpBNB : Coin(
        index = 204L,
        name = "OpBNB",
        symbol = "BNB",
        url = "https://opbnb.bnbchain.org/en",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/opbnb/info/logo.png"
    )

    data object InternetComputer : Coin(
        index = 223L,
        name = "Internet Computer",
        symbol = "ICP",
        url = "https://internetcomputer.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/internet_computer/info/logo.png"
    )

    data object Fio : Coin(
        index = 235L,
        name = "Fio",
        symbol = "FIO",
        url = "https://fioprotocol.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/fio/info/logo.png"
    )

    data object Nimiq : Coin(
        index = 242L,
        name = "Nimiq",
        symbol = "NIM",
        url = "https://nimiq.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/nimiq/info/logo.png"
    )

    data object Algorand : Coin(
        index = 283L,
        name = "Algorand",
        symbol = "ALGO",
        url = "https://www.algorand.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/algorand/info/logo.png"
    )

    data object Iost : Coin(
        index = 291L,
        name = "Iost",
        symbol = "IOST",
        url = "https://iost.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/iost/info/logo.png"
    )

    data object IoTeX : Coin(
        index = 304L,
        name = "IoTeX",
        symbol = "IOTX",
        url = "https://iotex.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/iotex/info/logo.png"
    )

    data object Nervos : Coin(
        index = 309L,
        name = "Nervos",
        symbol = "CKB",
        url = "https://nervos.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/nervos/info/logo.png"
    )

    data object Zilliqa : Coin(
        index = 313L,
        name = "Zilliqa",
        symbol = "ZIL",
        url = "https://zilliqa.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/zilliqa/info/logo.png"
    )

    data object TerraClassic : Coin(
        index = 330L,
        name = "Terra Classic",
        symbol = "LUNC",
        url = "https://terra.money",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/terra/info/logo.png"
    )

    data object Polkadot : Coin(
        index = 354L,
        name = "Polkadot",
        symbol = "DOT",
        url = "https://polkadot.network/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/polkadot/info/logo.png"
    )

    data object ThetaFuel : Coin(
        index = 361L,
        name = "Theta Fuel",
        symbol = "TFUEL",
        url = "https://www.thetatoken.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/tfuelevm/info/logo.png"
    )

    data object CryptoOrg : Coin(
        index = 394L,
        name = "Crypto.org",
        symbol = "CRO",
        url = "https://crypto.org/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/cryptoorg/info/logo.png"
    )

    data object Everscale : Coin(
        index = 396L,
        name = "Everscale",
        symbol = "EVER",
        url = "https://everscale.network/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/everscale/info/logo.png"
    )

    data object Near : Coin(
        index = 397L,
        name = "Near",
        symbol = "NEAR",
        url = "https://nearprotocol.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/near/info/logo.png"
    )

    data object Aion : Coin(
        index = 425L,
        name = "Aion",
        symbol = "AION",
        url = "https://aion.network",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/aion/info/logo.png"
    )

    data object Kusama : Coin(
        index = 434L,
        name = "Kusama",
        symbol = "KSM",
        url = "https://kusama.network",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/kusama/info/logo.png"
    )

    data object Aeternity : Coin(
        index = 457L,
        name = "Aeternity",
        symbol = "AE",
        url = "https://aeternity.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/aeternity/info/logo.png"
    )

    data object Kava : Coin(
        index = 459L,
        name = "Kava",
        symbol = "KAVA",
        url = "https://kava.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/kava/info/logo.png"
    )

    data object Filecoin : Coin(
        index = 461L,
        name = "Filecoin",
        symbol = "FIL",
        url = "https://filecoin.io/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/filecoin/info/logo.png"
    )

    data object Oasis : Coin(
        index = 474L,
        name = "Oasis",
        symbol = "ROSE",
        url = "https://oasisprotocol.org/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/oasis/info/logo.png"
    )

    data object Bluzelle : Coin(
        index = 483L,
        name = "Bluzelle",
        symbol = "BLZ",
        url = "https://bluzelle.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/bluzelle/info/logo.png"
    )

    data object BandChain : Coin(
        index = 494L,
        name = "BandChain",
        symbol = "BAND",
        url = "https://bandprotocol.com/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/band/info/logo.png"
    )

    data object Theta : Coin(
        index = 500L,
        name = "Theta",
        symbol = "THETA",
        url = "https://www.thetatoken.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/theta/info/logo.png"
    )

    data object Solana : Coin(
        index = 501L,
        name = "Solana",
        symbol = "SOL",
        url = "https://solana.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/solana/info/logo.png"
    )

    data object MultiversX : Coin(
        index = 508L,
        name = "MultiversX",
        symbol = "eGLD",
        url = "https://multiversx.com/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/elrond/info/logo.png"
    )

    data object Secret : Coin(
        index = 529L,
        name = "Secret",
        symbol = "SCRT",
        url = "https://scrt.network/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/secret/info/logo.png"
    )

    data object Agoric : Coin(
        index = 564L,
        name = "Agoric",
        symbol = "BLD",
        url = "https://agoric.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/agoric/info/logo.png"
    )

    data object Ton : Coin(
        index = 607L,
        name = "Ton",
        symbol = "TON",
        url = "https://ton.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/ton/info/logo.png"
    )

    data object Aptos : Coin(
        index = 637L,
        name = "Aptos",
        symbol = "APT",
        url = "https://aptoslabs.com/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/aptos/info/logo.png"
    )

    data object BNBBeaconChain : Coin(
        index = 714L,
        name = "BNB Beacon Chain",
        symbol = "BNB",
        url = "https://www.bnbchain.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/binance/info/logo.png"
    )

    data object Sui : Coin(
        index = 784L,
        name = "Sui",
        symbol = "SUI",
        url = "https://sui.io/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/sui/info/logo.png"
    )

    data object Acala : Coin(
        index = 787L,
        name = "Acala",
        symbol = "ACA",
        url = "https://acala.network",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/acala/info/logo.png"
    )

    data object VeChain : Coin(
        index = 818L,
        name = "VeChain",
        symbol = "VET",
        url = "https://vechain.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/vechain/info/logo.png"
    )

    data object Callisto : Coin(
        index = 820L,
        name = "Callisto",
        symbol = "CLO",
        url = "https://callisto.network",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/callisto/info/logo.png"
    )

    data object Neo : Coin(
        index = 888L,
        name = "Neo",
        symbol = "NEO",
        url = "https://neo.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/neo/info/logo.png"
    )

    data object Viction : Coin(
        index = 889L,
        name = "Viction",
        symbol = "VIC",
        url = "https://www.viction.xyz/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/viction/info/logo.png"
    )

    data object ECash : Coin(
        index = 899L,
        name = "eCash",
        symbol = "XEC",
        url = "https://e.cash",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/ecash/info/logo.png"
    )

    data object THORChain : Coin(
        index = 931L,
        name = "THORChain",
        symbol = "RUNE",
        url = "https://thorchain.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/thorchain/info/logo.png"
    )

    data object Polygon : Coin(
        index = 966L,
        name = "Polygon",
        symbol = "MATIC",
        url = "https://polygon.technology",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/polygon/info/logo.png"
    )

    data object OKXChain : Coin(
        index = 996L,
        name = "OKX Chain",
        symbol = "OKT",
        url = "https://www.okx.com/okc",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/okc/info/logo.png"
    )

    data object BitcoinDiamond : Coin(
        index = 999L,
        name = "Bitcoin Diamond",
        symbol = "BCD",
        url = "https://www.bitcoindiamond.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/bitcoindiamond/info/logo.png"
    )

    data object ThunderCore : Coin(
        index = 1001L,
        name = "ThunderCore",
        symbol = "TT",
        url = "https://thundercore.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/thundertoken/info/logo.png"
    )

    data object Harmony : Coin(
        index = 1023L,
        name = "Harmony",
        symbol = "ONE",
        url = "https://harmony.one",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/harmony/info/logo.png"
    )

    data object Ontology : Coin(
        index = 1024L,
        name = "Ontology",
        symbol = "ONT",
        url = "https://ont.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/ontology/info/logo.png"
    )

    data object ConfluxESpace : Coin(
        index = 1030L,
        name = "Conflux eSpace",
        symbol = "CFX",
        url = "https://confluxnetwork.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/cfxevm/info/logo.png"
    )

    data object Tezos : Coin(
        index = 1729L,
        name = "Tezos",
        symbol = "XTZ",
        url = "https://tezos.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/tezos/info/logo.png"
    )

    data object Cardano : Coin(
        index = 1815L,
        name = "Cardano",
        symbol = "ADA",
        url = "https://www.cardano.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/cardano/info/logo.png"
    )

    data object LightlinkPhoenix : Coin(
        index = 1890L,
        name = "Lightlink Phoenix",
        symbol = "LL",
        url = "https://lightlink.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/lightlink/info/logo.png"
    )

    data object Qtum : Coin(
        index = 2301L,
        name = "Qtum",
        symbol = "QTUM",
        url = "https://qtum.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/qtum/info/logo.png"
    )

    data object Nebulas : Coin(
        index = 2718L,
        name = "Nebulas",
        symbol = "NAS",
        url = "https://nebulas.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/nebulas/info/logo.png"
    )

    data object Hedera : Coin(
        index = 3030L,
        name = "Hedera",
        symbol = "HBAR",
        url = "https://hedera.com/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/hedera/info/logo.png"
    )

    data object Merlin : Coin(
        index = 4200L,
        name = "Merlin",
        symbol = "MERL",
        url = "https://merlinchain.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/merlin/info/logo.png"
    )

    data object Mantle : Coin(
        index = 5000L,
        name = "Mantle",
        symbol = "MNT",
        url = "https://www.mantle.xyz",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/mantle/info/logo.png"
    )

    data object BNBGreenfield : Coin(
        index = 5600L,
        name = "BNB Greenfield",
        symbol = "BNB",
        url = "https://greenfield.bnbchain.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/greenfield/info/logo.png"
    )

    data object BounceBit : Coin(
        index = 6001L,
        name = "BounceBit",
        symbol = "BB",
        url = "https://bouncebit.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/bouncebit/info/logo.png"
    )

    data object GoChain : Coin(
        index = 6060L,
        name = "GoChain",
        symbol = "GO",
        url = "https://gochain.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/gochain/info/logo.png"
    )

    data object ZenEon : Coin(
        index = 7332L,
        name = "Zen EON",
        symbol = "ZEN",
        url = "https://eon.horizen.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/zeneon/info/logo.png"
    )

    data object Base : Coin(
        index = 8453L,
        name = "Base",
        symbol = "ETH",
        url = "https://base.mirror.xyz/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/base/info/logo.png"
    )

    data object Nuls : Coin(
        index = 8964L,
        name = "Nuls",
        symbol = "NULS",
        url = "https://nuls.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/nuls/info/logo.png"
    )

    data object Wax : Coin(
        index = 14001L,
        name = "Wax",
        symbol = "WAXP",
        url = "http://wax.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/wax/info/logo.png"
    )

    data object Meter : Coin(
        index = 18000L,
        name = "Meter",
        symbol = "MTR",
        url = "https://meter.io/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/meter/info/logo.png"
    )

    data object Flux : Coin(
        index = 19167L,
        name = "Flux",
        symbol = "FLUX",
        url = "https://runonflux.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/zelcash/info/logo.png"
    )

    data object Celo : Coin(
        index = 52752L,
        name = "Celo",
        symbol = "CELO",
        url = "https://celo.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/celo/info/logo.png"
    )

    data object Linea : Coin(
        index = 59144L,
        name = "Linea",
        symbol = "ETH",
        url = "https://linea.build",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/linea/info/logo.png"
    )

    data object Stratis : Coin(
        index = 105105L,
        name = "Stratis",
        symbol = "STRAX",
        url = "https://www.stratisplatform.com/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/stratis/info/logo.png"
    )

    data object Scroll : Coin(
        index = 534352L,
        name = "Scroll",
        symbol = "ETH",
        url = "https://scroll.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/scroll/info/logo.png"
    )

    data object ZkLinkNovaMainnet : Coin(
        index = 810180L,
        name = "zkLink Nova Mainnet",
        symbol = "ETH",
        url = "https://zklink.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/zklinknova/info/logo.png"
    )

    data object Wanchain : Coin(
        index = 5718350L,
        name = "Wanchain",
        symbol = "WAN",
        url = "https://wanchain.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/wanchain/info/logo.png"
    )

    data object Waves : Coin(
        index = 5741564L,
        name = "Waves",
        symbol = "WAVES",
        url = "https://wavesplatform.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/waves/info/logo.png"
    )

    data object CronosChain : Coin(
        index = 10000025L,
        name = "Cronos Chain",
        symbol = "CRO",
        url = "https://cronos.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/cronos/info/logo.png"
    )

    data object NativeInjective : Coin(
        index = 10000060L,
        name = "Native Injective",
        symbol = "INJ",
        url = "https://injective.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/nativeinjective/info/logo.png"
    )

    data object OPMainnet : Coin(
        index = 10000070L,
        name = "OP Mainnet",
        symbol = "ETH",
        url = "https://optimism.io/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/optimism/info/logo.png"
    )

    data object GnosisChain : Coin(
        index = 10000100L,
        name = "Gnosis Chain",
        symbol = "xDAI",
        url = "https://www.xdaichain.com",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/xdai/info/logo.png"
    )

    data object Osmosis : Coin(
        index = 10000118L,
        name = "Osmosis",
        symbol = "OSMO",
        url = "https://osmosis.zone/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/osmosis/info/logo.png"
    )

    data object SmartBitcoinCash : Coin(
        index = 10000145L,
        name = "Smart Bitcoin Cash",
        symbol = "BCH",
        url = "https://smartbch.org/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/smartbch/info/logo.png"
    )

    data object Fantom : Coin(
        index = 10000250L,
        name = "Fantom",
        symbol = "FTM",
        url = "https://fantom.foundation",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/fantom/info/logo.png"
    )

    data object Boba : Coin(
        index = 10000288L,
        name = "Boba",
        symbol = "BOBAETH",
        url = "https://boba.network/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/boba/info/logo.png"
    )

    data object KuCoinCommunityChain : Coin(
        index = 10000321L,
        name = "KuCoin Community Chain",
        symbol = "KCS",
        url = "https://www.kcc.io/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/kcc/info/logo.png"
    )

    data object ZkSyncEra : Coin(
        index = 10000324L,
        name = "zkSync Era",
        symbol = "ETH",
        url = "https://portal.zksync.io/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/zksync/info/logo.png"
    )

    data object Terra : Coin(
        index = 10000330L,
        name = "Terra",
        symbol = "LUNA",
        url = "https://terra.money",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/terrav2/info/logo.png"
    )

    data object HuobiECOChain : Coin(
        index = 10000553L,
        name = "Huobi ECO Chain",
        symbol = "HT",
        url = "https://www.hecochain.com/en-us",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/heco/info/logo.png"
    )

    data object AcalaEVM : Coin(
        index = 10000787L,
        name = "Acala EVM",
        symbol = "ACA",
        url = "https://acala.network",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/acalaevm/info/logo.png"
    )

    data object Coreum : Coin(
        index = 10000990L,
        name = "Coreum",
        symbol = "CORE",
        url = "https://www.coreum.com/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/coreum/info/logo.png"
    )

    data object Metis : Coin(
        index = 10001088L,
        name = "Metis",
        symbol = "METIS",
        url = "https://www.metis.io/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/metis/info/logo.png"
    )

    data object PolygonZkEVM : Coin(
        index = 10001101L,
        name = "Polygon zkEVM",
        symbol = "ETH",
        url = "https://www.polygon.technology/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/polygonzkevm/info/logo.png"
    )

    data object Moonbeam : Coin(
        index = 10001284L,
        name = "Moonbeam",
        symbol = "GLMR",
        url = "https://moonbeam.network",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/moonbeam/info/logo.png"
    )

    data object Moonriver : Coin(
        index = 10001285L,
        name = "Moonriver",
        symbol = "MOVR",
        url = "https://moonbeam.network/networks/moonriver",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/moonriver/info/logo.png"
    )

    data object Ronin : Coin(
        index = 10002020L,
        name = "Ronin",
        symbol = "RON",
        url = "https://whitepaper.axieinfinity.com/technology/ronin-ethereum-sidechain",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/ronin/info/logo.png"
    )

    data object KavaEvm : Coin(
        index = 10002222L,
        name = "KavaEvm",
        symbol = "KAVA",
        url = "https://www.kava.io/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/kavaevm/info/logo.png"
    )

    data object IoTeXEVM : Coin(
        index = 10004689L,
        name = "IoTeX EVM",
        symbol = "IOTX",
        url = "https://iotex.io/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/iotexevm/info/logo.png"
    )

    data object NativeZetaChain : Coin(
        index = 10007000L,
        name = "NativeZetaChain",
        symbol = "ZETA",
        url = "https://www.zetachain.com/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/zetachain/info/logo.png"
    )

    data object NativeCanto : Coin(
        index = 10007700L,
        name = "NativeCanto",
        symbol = "CANTO",
        url = "https://canto.io/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/nativecanto/info/logo.png"
    )

    data object Klaytn : Coin(
        index = 10008217L,
        name = "Klaytn",
        symbol = "KLAY",
        url = "https://klaytn.foundation",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/klaytn/info/logo.png"
    )

    data object AvalancheCChain : Coin(
        index = 10009000L,
        name = "Avalanche C-Chain",
        symbol = "AVAX",
        url = "https://www.avalabs.org/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/avalanchec/info/logo.png"
    )

    data object Evmos : Coin(
        index = 10009001L,
        name = "Evmos",
        symbol = "EVMOS",
        url = "https://evmos.org/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/evmos/info/logo.png"
    )

    data object ArbitrumNova : Coin(
        index = 10042170L,
        name = "Arbitrum Nova",
        symbol = "ETH",
        url = "https://nova.arbitrum.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/arbitrumnova/info/logo.png"
    )

    data object Arbitrum : Coin(
        index = 10042221L,
        name = "Arbitrum",
        symbol = "ETH",
        url = "https://arbitrum.io",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/arbitrum/info/logo.png"
    )

    data object Sommelier : Coin(
        index = 11000118L,
        name = "Sommelier",
        symbol = "SOMM",
        url = "https://www.sommelier.finance/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/sommelier/info/logo.png"
    )

    data object FetchAI : Coin(
        index = 12000118L,
        name = "Fetch AI",
        symbol = "FET",
        url = "https://fetch.ai/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/fetchai/info/logo.png"
    )

    data object MarsHub : Coin(
        index = 13000118L,
        name = "Mars Hub",
        symbol = "MARS",
        url = "https://marsprotocol.io/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/mars/info/logo.png"
    )

    data object Umee : Coin(
        index = 14000118L,
        name = "Umee",
        symbol = "UMEE",
        url = "https://umee.cc/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/umee/info/logo.png"
    )

    data object Quasar : Coin(
        index = 15000118L,
        name = "Quasar",
        symbol = "QSR",
        url = "https://www.quasar.fi/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/quasar/info/logo.png"
    )

    data object Persistence : Coin(
        index = 16000118L,
        name = "Persistence",
        symbol = "XPRT",
        url = "https://persistence.one/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/persistence/info/logo.png"
    )

    data object Akash : Coin(
        index = 17000118L,
        name = "Akash",
        symbol = "AKT",
        url = "https://akash.network/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/akash/info/logo.png"
    )

    data object Noble : Coin(
        index = 18000118L,
        name = "Noble",
        symbol = "USDC",
        url = "https://nobleassets.xyz/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/noble/info/logo.png"
    )

    data object Sei : Coin(
        index = 19000118L,
        name = "Sei",
        symbol = "SEI",
        url = "https://sei.io/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/sei/info/logo.png"
    )

    data object Stargaze : Coin(
        index = 20000118L,
        name = "Stargaze",
        symbol = "STARS",
        url = "https://www.stargaze.zone/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/stargaze/info/logo.png"
    )

    data object BNBSmartChain : Coin(
        index = 20000714L,
        name = "BNB Smart Chain",
        symbol = "BNB",
        url = "https://www.binance.org/en/smartChain",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/smartchain/info/logo.png"
    )

    data object ZetaEVM : Coin(
        index = 20007000L,
        name = "Zeta EVM",
        symbol = "ZETA",
        url = "https://www.zetachain.com/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/zetaevm/info/logo.png"
    )

    data object NativeEvmos : Coin(
        index = 20009001L,
        name = "Native Evmos",
        symbol = "EVMOS",
        url = "https://evmos.org/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/nativeevmos/info/logo.png"
    )

    data object Celestia : Coin(
        index = 21000118L,
        name = "Celestia",
        symbol = "TIA",
        url = "https://celestia.org/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/tia/info/logo.png"
    )

    data object DYdX : Coin(
        index = 22000118L,
        name = "dYdX",
        symbol = "DYDX",
        url = "https://dydx.exchange",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/dydx/info/logo.png"
    )

    data object Juno : Coin(
        index = 30000118L,
        name = "Juno",
        symbol = "JUNO",
        url = "https://www.junonetwork.io/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/juno/info/logo.png"
    )

    data object Tbnb : Coin(
        index = 30000714L,
        name = "TBNB",
        symbol = "BNB",
        url = "https://www.bnbchain.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/tbinance/info/logo.png"
    )

    data object Stride : Coin(
        index = 40000118L,
        name = "Stride",
        symbol = "STRD",
        url = "https://stride.zone/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/stride/info/logo.png"
    )

    data object Axelar : Coin(
        index = 50000118L,
        name = "Axelar",
        symbol = "AXL",
        url = "https://axelar.network/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/axelar/info/logo.png"
    )

    data object Crescent : Coin(
        index = 60000118L,
        name = "Crescent",
        symbol = "CRE",
        url = "https://crescent.network/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/crescent/info/logo.png"
    )

    data object Kujira : Coin(
        index = 70000118L,
        name = "Kujira",
        symbol = "KUJI",
        url = "https://kujira.app/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/kujira/info/logo.png"
    )

    data object Comdex : Coin(
        index = 80000118L,
        name = "Comdex",
        symbol = "CMDX",
        url = "https://comdex.one/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/comdex/info/logo.png"
    )

    data object Neutron : Coin(
        index = 90000118L,
        name = "Neutron",
        symbol = "NTRN",
        url = "https://neutron.org/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/neutron/info/logo.png"
    )

    data object Neon : Coin(
        index = 245022934L,
        name = "Neon",
        symbol = "NEON",
        url = "https://neonevm.org",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/neon/info/logo.png"
    )

    data object Aurora : Coin(
        index = 1323161554L,
        name = "Aurora",
        symbol = "ETH",
        url = "https://aurora.dev/",
        logoUrl = "https://raw.githubusercontent.com/trustwallet/assets/master/blockchains/aurora/info/logo.png"
    )
}
