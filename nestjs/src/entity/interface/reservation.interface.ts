export interface Reservation {
    id: string;
    createdAt: Date;
    updatedAt: Date;
    ticketId: number;
    startAt: Date;
    endAt: Date;
}