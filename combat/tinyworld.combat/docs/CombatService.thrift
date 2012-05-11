/**
 * The first thing to know about are types. The available types in Thrift are:
 *
 *  bool        Boolean, one byte
 *  byte        Signed byte
 *  i16         Signed 16-bit integer
 *  i32         Signed 32-bit integer
 *  i64         Signed 64-bit integer
 *  double      64-bit floating point value
 *  string      String
 *  binary      Blob (byte array)
 *  map<t1,t2>  Map from one type to another
 *  list<t1>    Ordered list of one type
 *  set<t1>     Set of unique elements of one type
 *
 * Did you also notice that Thrift supports C style comments?
 */
namespace php bma.tinyworld.combat.thrift
namespace java bma.tinyworld.combat.thrift

struct TState {
	1: string version,
	2: i32 queueSize,
}

service TCombatService {

	TState getServiceState(),

   	string processCombat(1:string data),
 	
}